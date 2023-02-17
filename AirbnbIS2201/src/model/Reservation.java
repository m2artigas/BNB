/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Reservation {
    
    public Date dateIn;
    public Date dateOut;
    private static int nextId = 0;
    private final int reservationId;
    
    private Invoice invoice;
    private ReservationState reservationState;
    
    
    private boolean isChecked;
    private double totalPrice;
    
    private final User user;
    private final Lodgement lodgement;
    
    public Reservation(User user, Lodgement lodgement, Date dateIn, Date dateOut) {
        this.reservationId = Reservation.nextId;
        Reservation.nextId++;
        
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.user = user;
        this.lodgement = lodgement;
        this.isChecked = false;
        this.totalPrice = getTotalPrice(lodgement, dateIn, dateOut);
        this.invoice = new Invoice(this.totalPrice, this.getId());
        
        
        if (lodgement.typeReservation == lodgement.typeReservation.Immediate) {
            this.reservationState = ReservationState.WaitingPayment;
        } else {
            this.reservationState = ReservationState.PendingApproval;
        }
        
    }
    
    public enum ReservationState {
        PendingApproval,
        WaitingPayment,
        Paid,
        Cancelled
    }
    
    public int getId() {
        return this.reservationId;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public Lodgement getLodgement() {
        return this.lodgement;
    }

    public Date getDateIn() {
        return this.dateIn;
    }
    public Date getDateOut() {
        return this.dateOut;
    }
    
    public double getTotalPrice() {      
        return this.totalPrice;  
    }
    
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void pay(Invoice.PaymentType type) {
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

        this.invoice.pay(date, type);
        this.reservationState = ReservationState.Paid;
        
    }
    
    public static double getTotalPrice(Lodgement lodgement, Date dateIn, Date dateOut) {

        if (lodgement == null) {
            throw new IllegalArgumentException("La casa con ID " + lodgement.getId() + " no existe");
        }    
        long diference = dateOut.getTime() - dateIn.getTime();
        long days = diference / (1000 * 60 * 60 * 24);
    
        double totalPrice = days * lodgement.getAmountDay();

        return totalPrice;
    }
    
    public void cancelReservation() {
        this.reservationState = ReservationState.Cancelled;
    }
    
    public boolean modifyReservation(Date dateIn, Date dateOut) {
        
        //Can't be modified if its already paid
        if (this.reservationState == ReservationState.Paid) {
            return false;
        }
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.totalPrice = getTotalPrice(lodgement, dateIn, dateOut);
        this.invoice = new Invoice(this.totalPrice, this.getId());
        return true;
    }
    
    public boolean isChecked() {
        return this.isChecked;
    }
    
    public void check() {
        this.isChecked = true;
    }
    
    public ReservationState getReservationState() {
        return this.reservationState;
    }
    
    @Override
    public String toString() { 
        return lodgement.getName() + " - " + getTotalPrice() + " €" + (this.reservationState == ReservationState.Cancelled ? " - Cancelado" : ( this.isChecked() ? " - CheckIn Hecho" : (this.reservationState == ReservationState.Paid ? " - Pagado": "")));
    }
    
}

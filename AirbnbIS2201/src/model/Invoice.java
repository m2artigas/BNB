
package model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

 
public class Invoice {
    public double amount;
    public Date date;
    public Date paymentDate;
    public InvoiceState state;
    public PaymentType paymentType;
    public int reservationId;
    
    public Invoice(double price, int reservationId) {
        this.amount = price;
        this.reservationId = reservationId;
        
        ZoneId defaultZoneId = ZoneId.systemDefault(); 
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        
        this.date = date;
        this.paymentType = null;
        this.state = InvoiceState.New;
        this.paymentDate = null;
    }
    
    enum InvoiceState {
        New,
        Paid
    }
    
    public enum PaymentType {
        PayPal,
        CreditCard
        }
    
    
    public void pay(Date paymentDate, PaymentType type) {
        this.paymentType = type;
        this.paymentDate = paymentDate;
        this.state = InvoiceState.Paid;    
    }
    
    @Override
    public String toString(){
        return reservationId + (state == InvoiceState.Paid ? (" - Pagado - Método: " + (PaymentType.CreditCard ==  paymentType ? "Tarjeta de Crédito" : "PayPal")): " - Nuevo");
    }
    
}

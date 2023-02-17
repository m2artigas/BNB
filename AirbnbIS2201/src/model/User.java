
package model;

import java.util.*;


public class User {
    
    private ArrayList<Reservation> reservationHistory; 
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private Date birthday;
    private static int nextId = 0;
    private final int userId;
    
    public User(String name, String surname, String email, String password, String phoneNumber, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.reservationHistory = new ArrayList<Reservation>();
        this.userId = User.nextId;
        User.nextId++;
        
    }
    
    public void addReservation(Lodgement lodgement, Date dateIn, Date dateOut) {
        Reservation reservation = new Reservation(this, lodgement, dateIn, dateOut);
       
        reservationHistory.add(reservation);
    }
    
    public void modifyUser(String name, String surname, String email, String password, String phoneNumber, Date birthday) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setBirthday(birthday);
    }
    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
     public String getName() {
         return this.name;
     }
     
     public void setSurname(String surname) {
        if (surname != null) {
            this.surname = surname;
        }
    }
     public String getSurname() {
         return this.surname;
     }
     
     public void setEmail(String email) {
         if (email != null) {
             this.email = email;
         }
     }
     
     public String getEmail() {
         return this.email;
     }
     
     public void setPhoneNumber(String phoneNumber) {
         if (phoneNumber != null) {
             this.phoneNumber = phoneNumber;
         }
     }
     
     public String getPhoneNumber() {
         return this.phoneNumber;
     }
     
     public void setBirthday(Date birthday) {
         if (birthday != null) {
             this.birthday = birthday;
         }
     }
     
     public Date getBirthday() {
         return this.birthday;
     }
     
     public void setPassword(String password) {
         if (password != null) {
             this.password = password;
         }
     }
     
    public String getPassword(){
        return this.password;
    }
     
     public int getId(){
         return this.userId;
     }
     
     public ArrayList<Reservation> getReservationHistory (){
         return this.reservationHistory;
     }
}

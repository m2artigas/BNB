
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author galax
 */
public class Airbnb {
    private ArrayList<User> users; 
    public ArrayList<Lodgement> lodgements; 
     
    public Airbnb() {
        users = new ArrayList<User>();
        lodgements = new ArrayList<Lodgement>();
    }
    
    public void addUser(String name, String surname, String email, String password, String phoneNumber, Date birthday){
        User user = new User(name, surname, email, password, phoneNumber, birthday);
        users.add(user);
    }
    
    public void addLodgement(String name, String description, String location, int numberBeds, double priceDay, Lodgement.LodgementTypeOfReservation typeReservation, String image) {
        
        Lodgement lodgement = new Lodgement(name, description, location, numberBeds, priceDay, typeReservation,image);
        lodgements.add(lodgement);
    }
   
    public void deleteLodgement(int lodgement) {
        lodgements.remove(lodgement);
    }
    
    public void deleteUser(int user) {
        users.remove(user);
    }
    
    public Lodgement viewLodgement(int lodgement){
        return lodgements.get(lodgement);
    }
    
    public User viewUser(int user) {
        return users.get(user);
    }
    
    public User loginUser(String name, String password){
        
        for (User user: users) {
            if (user.getName().equalsIgnoreCase(name) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
}

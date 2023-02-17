package app;

import gui.LoginForm;
import java.util.*;
import model.*;

public class Airbnbapp {

    public static void main(String[] args) {
        Airbnb airbnb = new Airbnb();
        inicializar_modelo(airbnb);
        
        LoginForm loginForm = new LoginForm(airbnb);
        loginForm.setVisible(true);
        
    }
    

    private static void inicializar_modelo(Airbnb airbnb) {
        airbnb.addLodgement("Apartamento Rural con Granja", "Tranquila casa rural", "La roza, Asturias, España", 1, 235.0, Lodgement.LodgementTypeOfReservation.Immediate, "/Imagenes/Casa1.2.jpg");
        airbnb.addLodgement("Casa Completa con Piscina Privada", null, "Viseu, Portugal", 3, 120.0, Lodgement.LodgementTypeOfReservation.Immediate, "/Imagenes/Casa3.2.jpg");
        airbnb.addLodgement("Villa Luxury Soulhouse", "Casa privada", "Marbella, Andalucía, España", 4, 2895.0, Lodgement.LodgementTypeOfReservation.ByApproval, "/Imagenes/Casa5.2.jpg");
        
        airbnb.addUser("Juan", "Gutiérrez", "guti@gmail.com", "1234", null, null);
        airbnb.addUser("Marta", "Sánchez", null, "billyjeans", "872938471", null);
        airbnb.addUser("Antonio", "Díaz", "martinez@gmail.com", "colo", null, null);
        
    }

}

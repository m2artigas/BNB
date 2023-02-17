
package model;

import java.util.ArrayList;

public class Lodgement {
    
    private static int nextId = 0;
    private final int lodgementId;
    private String location;
    private String name;
    private String description;
    private int numberBeds;
    private double amountDay;
    private String image;
    private boolean isChecked;
    
    public LodgementType lodgementType;

    public LodgementTypeOfReservation typeReservation;
    public ArrayList<LodgementEquipment> lodgementEquipment;

    public Lodgement(String name, String description, String location, int numberBeds, double priceDay, LodgementTypeOfReservation typeReservation, String image) {
        this.lodgementId = Lodgement.nextId;
        Lodgement.nextId++;
        
        this.image = image;
        this.name = name;
        this.location = location;
        this.numberBeds = numberBeds;
        this.description = description;
        this.amountDay = priceDay;
        this.typeReservation = typeReservation;
    }
    
    public enum LodgementType {
        Countryside("Campo"),
        Beachfront("Playa"),
        Mansion("Mansión"),
        PrivateRooms("Habitación Privada");
        
        private final String type;
        
        private LodgementType(String s){
            type = s;
        }   
        
        @Override
        public String toString(){
            return type;
        }
    }
    
   public enum LodgementEquipment {
        Wifi("Wifi"),
        Pool("Piscina"),
        Kitchen("Cocina"),
        TV("TV"),
        AirConditioner("Aire Acondicionado");

        private final String equipment;
        
        private LodgementEquipment(String s){
            equipment = s;
        }   
        
        @Override
        public String toString(){
            return equipment;
        }
    }
    
    public enum LodgementTypeOfReservation{
        Immediate("Reserva Inmediata"),
        ByApproval("Reserva por aprobación");
        
        private final String typeOfReservation;
        
        private LodgementTypeOfReservation(String s){
            typeOfReservation = s;
        }   
        
        @Override
        public String toString(){
            return typeOfReservation;
        }
    }
    
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image){
        this.image = image;
    }
    
    public int getId() {
        return lodgementId;
    }
    
    public void setLodgementEquipment(ArrayList<LodgementEquipment> lodgementEquipment){
        this.lodgementEquipment = lodgementEquipment;
    }
    
    public void setLodgementType(LodgementType type){
        this.lodgementType = type;
    }
    
    public void setNumberBeds(int numberBeds) {
        this.numberBeds = numberBeds;
    }

    public int getNumberBeds (){
        return this.numberBeds;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmountDay() {
        return amountDay;
    }

    public void setAmountDay(double priceDay) {
        this.amountDay = priceDay;
    }
    
    public boolean isChecked(){
        return this.isChecked;
    }
    
    @Override
    public String toString(){
        String sep = " - ";
        StringBuffer sb = new StringBuffer();
        
        if(description != null)
            sb.append(description).append(" - ");
        
        if(lodgementType != null)
            sb.append(lodgementType).append(" - ");
        
        if(typeReservation != null)
            sb.append(typeReservation);
        
        return sb.toString();
    }
    
}

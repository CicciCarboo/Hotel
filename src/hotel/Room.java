
/* QUESTIONS
1) How to autoincrement oblects ID's.? Svar: kolla video @timestamp: 23:00 min: https://youtu.be/CnVp7T-eA5A
2) How many rooms of each in hotel?
3) Satic variables are messing things up. Lets try non static room ID and call it from database in RoomAvailability-method instead?


*/
package hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Room {
    // Superclass/parentclass to all Room classes
    protected static Scanner input = new Scanner(System.in);
    
    
    
    protected String roomID;
    protected String roomName = "Standard single room";
    protected String typeOfBed = "Standard single bed";
    protected String viewFromRoom = "Pateo view";
    protected String bathroomUitilities = "Toilet, zink, shower";
    protected String furniture = "Television. Tea kettle. Iron with iron board. Desk and restchair";
    protected String roomDescription = "Room description: " + roomName + ". Television. Safe-deposit box. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+"." ;
    protected boolean airCondition = false;
    protected boolean freeBreakfast = true;
    protected boolean isRoomAvailable = true;
    protected int chargePerDay = 1000;
    
    public Room() {
    }
    
    public Room(String roomID, String roomName, String typeOfBed, boolean airCondition, boolean freeBreakfast, boolean isRoomAvailable, int chargePerDay) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.typeOfBed = typeOfBed;
        this.airCondition = airCondition;
        this.freeBreakfast = freeBreakfast;
        this.isRoomAvailable = isRoomAvailable;
        this.chargePerDay = chargePerDay;
    }
    
    public String getRoomID() {
        return roomID;
    }
    
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    public String getTypeOfBed() {
        return typeOfBed;
    }
    
    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }
    
    public String getRoomDescription() {
        return roomDescription;
    }
    
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
    
    public boolean isAirCondition() {
        return airCondition;
    }
    
    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }
    
    public boolean isFreeBreakfast() {
        return freeBreakfast;
    }
    
    public void setFreeBreakfast(boolean freeBreakfast) {
        this.freeBreakfast = freeBreakfast;
    }
    
    public boolean isIsRoomAvailable() {
        return isRoomAvailable;
    }
    
    public void setIsRoomAvailable(boolean isRoomAvailable) {
        this.isRoomAvailable = isRoomAvailable;
    }
    
    public int getChargePerDay() {
        return chargePerDay;
    }
    
    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }
    
    public String getViewFromRoom() {
        return viewFromRoom;
    }
    
    public void setViewFromRoom(String viewFromRoom) {
        this.viewFromRoom = viewFromRoom;
    }
    
    public String getBathroomUitilities() {
        return bathroomUitilities;
    }
    
    public void setBathroomUitilities(String bathroomUitilities) {
        this.bathroomUitilities = bathroomUitilities;
    }
    
    public String getFurniture() {
        return furniture;
    }
    
    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }
    
     @Override
    public String toString() {
        return "Room{" + "roomID=" + roomID + ", roomName=" + roomName + ", typeOfBed=" + typeOfBed + ", roomDescription=" + roomDescription + ", airCondition=" + airCondition + ", freeBreakfast=" + freeBreakfast + ", isRoomAvailable=" + isRoomAvailable + ", chargePerDay=" + chargePerDay + '}';
    }
    
    public void displayRoom(){  // these methods can only be called from the object since they are non static.
        System.out.println(roomDescription);
    }
    
    public void roomAvailability(){ // can only be called from the object due to non static. Not directly from a static context.
        
        if(isRoomAvailable==true){
            
            boolean exit = false;
            do{
                System.out.println("The " + roomName + " is available. The fee is "+ chargePerDay +" SEK per night. \nIf you wish to book this room enter: 1.\nIf you want to exit this menu enter: 2.");
                
                try {
                    int choice = input.nextByte();
                    if (choice == 1 || choice == 2){
                        switch(choice){
                            case 1:
                                isRoomAvailable=false;
                                input.nextLine();
                                System.out.println("Please enter your customer ID.");
                                //some code to register room to customer ID in booking class/database
                                try {
                                    int customerID = input.nextInt();
                                    //Method to controll that customerID exists in database and register to booking table in database.
                                    System.out.println("CustomerID has been registered.");
                                } catch (Exception e) {
                                    input.nextLine();
                                }
                                input.nextLine();
                                //some code to get roomID and enter it in the following answer: CHECK!!! A generic method to the rescue!!!                                
                                System.out.println("You have now booked the room ....TEMPORARY ID: "+ roomID +" !!! Ist to be autoincremented.... You will be charged "+ chargePerDay +" SEK per night.");
                                exit = true;
                                break;
                            case 2:
                                System.out.println("No booking has been performed. Exiting this menu.");
                                exit = true;
                                break;
                            default:
                                System.out.println("Returning to main menu.");
                                exit = true;
                                break;
                        }
                    }else
                        System.out.println("Please select 1 or 2.");
                    
                } catch (Exception e) {
                    input.nextLine();
                    System.err.println("Please use only the digits 1 or 2 for your choice.");
                }
                
            }while (!exit);
            
        }else
            System.out.println("Sorry, the room is not available. Returning to main menu.");
    }
    
    public static void nonGenericRoom(){
       // System.out.println("In my NON generic room method i can call this room: " + roomName);
    }

    public static void generateHotel(){
        
        List<Room> hotel = new LinkedList<Room>();// Trying to autofill the rooms
                   
            // try this later on: IntStream.range(0, 10).map(y -> 2 + y * 2).forEach(arraylist::add);
            
//  Trial nr 144: following doesnt work due to static variables. Thats why all entries get the
//  same value. If I make them non static they dont worc in the methods later on. Remove statics. CHECK!!!
// How to we get it to work with methods without statics?


        for (int i = 0; i < 10; i++) {
            hotel.add(new Room());  
        }               
            
        for (int i = 11; i < 16; i++) {
            hotel.add(new RoomSingleDeluxe());  
        }    
            
        for (int i = 16; i < 21; i++) {
            hotel.add(new RoomDoubleDeluxe());  
        }
             
        for (int i = 21; i < 26; i++) {
            hotel.add(new RoomLuxury());  
        } 
            
        int i = 0;
        for (Room room : hotel) {
            ++i;
            room.setRoomID("R"+i);
        }           

        System.out.println("Whats in the hotel?");
            
        for (Room room : hotel) {
            System.out.println(room);
        }
                        
        System.out.println("Hur många rum blev det i hotellet? Svar: "+hotel.size());    
            
    //
//  Now trying the monster approch from Felicias dungeon run. Making a stack fisrt...
        
//        int totalNrHotelRooms = 0;
//        int nrOfStandardRooms = 10;
//        int nrOfSingleDeluxe = 5;
//        int nrOfDoubleDeluxe = 5;
//        int nrOfLuxury = 5;
//            totalNrHotelRooms = nrOfStandardRooms+nrOfSingleDeluxe+nrOfDoubleDeluxe+nrOfLuxury;
            
    }
}

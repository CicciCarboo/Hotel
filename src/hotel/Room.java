
/* QUESTIONS
1) How to autoincrement oblects ID's.? Svar: kolla video @timestamp: 23:00 min: https://youtu.be/CnVp7T-eA5A
2) How many rooms of each in hotel?
3) Satic variables are messing things up. Lets try non static room ID and call it from database in RoomAvailability-method instead?


*/
package hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class Room {
    // Superclass/parentclass to all Room classes
    protected static Scanner input = new Scanner(System.in);
    
    
    public static List<Room> hotel = new LinkedList<Room>();
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
    
    public static void generateHotel(){
        
        // Trying to autofill the rooms
                   
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
    
    public void displayRoom(){  // these methods can only be called from the object since they are non static.
        System.out.println(roomDescription);
    }
    
  
    public static void roomAvailability(){
       
        boolean exit = false;
        do {            
            
       
        System.out.println("\n\n********************** BOOKING ROOM ***********************");
        
        System.out.println("\nSelect one of following options: ");
        System.out.println("\n1. Standard single room, 1000 SEK/night. ");
        System.out.println("2. Single deluxe room, 1500 SEK/night. ");
        System.out.println("3. Double deluxe room, 2000 SEK/night. ");
        System.out.println("4. Luxury room, 3000 SEK/night. ");
        System.out.println("5. Exit to previous menu. ");
        
        int option = input.nextInt();
        input.nextLine();
        String choice;
        switch(option){
            case 1:
                choice = "Standard single room";
                findRoomCategory(choice);
                bookRoom();
                break;
            case 2:
                choice = "Single deluxe room";
                findRoomCategory(choice);
                bookRoom();
                break;
            case 3:
                choice = "Double deluxe room";
                findRoomCategory(choice);
                bookRoom();
                break;
            case 4:
                choice = "Luxury room";
                findRoomCategory(choice);
                bookRoom();
                break;
            default:
                System.out.println("Exiting to previous menu.");
                exit = true;
                break;
        }
        
            
         } while (!exit);
    
    }
    
    public static void findRoomCategory(String choice){
        //Not allowed to use the static String variable choice in the switch set. Using a bridge variable
        // and convert it to choice after switch.
       // String choice = bridge;
        
        Set<Room> availableRoom =
         hotel.stream()
               .filter((r) -> (r.roomName.equals(choice)))
                .filter((r) -> ((r.isRoomAvailable==true)))
                //.forEach((r) -> System.out.println("RoomID of available room: "+r.roomID));
                //   .count();
                 .collect(Collectors.toSet());
      // System.out.println("\nTesting stream, nr. of available Rooms found in hotel: "+availableRoomIDs);
        System.out.println("\nFollowing "+choice+"s are available");
        for (Room r : availableRoom)               
            System.out.println("RoomID: " + r.roomID);            
       
    }
    
    public static void bookRoom(){
        
        boolean exit=false;
        do {
            System.out.print("\nEnter desired room ID: ");
            String roomID = input.nextLine();
            
            for (Room room : hotel) {
                if (room.roomID.equalsIgnoreCase(roomID)) {
                    room.setIsRoomAvailable(false);
                    System.out.println("Room \""+roomID+"\" has now been booked:\n"+room);
                    exit = true;
                }
//                else      //FUNKAR OÖNSKAT. Skrivs ut på varje rad som ej matchar ID.
//                    System.err.println("Please choose a room ID from the given list.");
                }
        } while (!exit);       
    }
}

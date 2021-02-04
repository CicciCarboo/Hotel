
/* QUESTIONS
TODO: return booking ID after booking. Get it from database.

    For fun: Add to roomAvailability() : efter booking, run interface methods for the specific room.
*/

//          author C. Carboo
package hotel;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class Room implements Serializable{
    // Superclass/parentclass to all Room classes
    protected static Scanner input = new Scanner(System.in);
    
    
    public static List<Room> hotel = new LinkedList<Room>();
    protected String roomID;
    protected String roomName = "Standard single room";
    protected String typeOfBed = " Standard single bed";
    protected String viewFromRoom = " Pateo view";
    protected String bathroomUitilities = " Toilet, zink, shower";
    protected String furniture = " Television. Tea kettle. Iron with iron board. Desk and restchair";
    protected String roomDescription = "" + roomName + ". Safe-deposit box. " + typeOfBed +". "+ viewFromRoom +". " + bathroomUitilities +". "+ furniture+"." ;
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
        return "" + roomDescription;
    }
    
    public static void generateHotel() throws SQLException{         // author C. Carboo
        
        Statement sqlStatement = null;
        PreparedStatement prepStat;
        // Autofilling the hotel with rooms
                                               // For fun: try this later on: IntStream.range(0, 10).map(y -> 2 + y * 2).forEach(arraylist::add);
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
            // fields in room table to fill: roomId, roomName, ChargePerDay, available
            Hotel.connectDB();
            prepStat = Hotel.connection.prepareStatement("INSERT INTO room VALUE(?,?,?,?)"); //Null pointer exception här! Varför?
                        prepStat.setString(1, room.getRoomID());
                        prepStat.setString(2, room.getRoomName());
                        prepStat.setInt(3, room.getChargePerDay());
                        prepStat.setInt(4,1);
            
            prepStat.executeUpdate();
            Hotel.closeConDB();
        }           

//        System.out.println("Whats in the hotel?");
//            
//        for (Room room : hotel) {
//            System.out.println(room);
//        }
//                        
//        System.out.println("Hur många rum blev det i hotellet? Svar: "+hotel.size());    
//            
    }
    
    public static <E> void genericDisplayMethod(E e1,E e2,E e3,E e4){ // make Generic???
        
        boolean exit= false;
        while (!exit) {            
            
        
        System.out.println("********************* DISPLAY DETAILS *********************");
        
        System.out.println("\nElite Hotel offers following options: \n");
        System.out.println("" + e1);
        System.out.println("" + e2);
        System.out.println("" + e3);
        System.out.println("" + e4);
        System.out.println("\n1. Previous menu to place an order or exit. ");
        
        try {
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("\nExiting to previous menu.");
                    exit = true;
                    break;
                default:
                    System.err.println("Wrong input. Try again:");
                    break;
                    
            }
        } catch (Exception e) {
            input.nextLine();
            System.err.println("Wrong input. Try again:");
        }
        
        }
        
    }
    
  
    public static void roomAvailability(){      // author C. Carboo

//      Prompting user to choose room catecory from the menu. 
//      Given choice will display rooms according to category, via other methods.         
        boolean exit = false;
        do {                  
            System.out.println("\n\n********************** BOOKING ROOM ***********************");
            
            System.out.println("\nSelect one of following options: ");
            System.out.println("\n1. Standard single room, 1000 SEK/night. ");
            System.out.println("2. Single deluxe room, 1500 SEK/night. ");
            System.out.println("3. Double deluxe room, 2000 SEK/night. ");
            System.out.println("4. Luxury room, 3000 SEK/night. ");
            System.out.println("5. Exit to previous menu. ");
            
            try {
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
                    case 5:
                        System.out.println("Exiting to previous menu.");
                        exit = true;
                        break;
                    default:
                        System.err.println("Wrong input. Enter one of the given options.");
                }
            } catch (Exception e) {
                input.nextLine();
                System.err.print("Wrong input. Try again:");
            }
            
         } while (!exit);
    
    }
    
    public static void findRoomCategory(String choice){     //author C. Carboo 
        
//      Filtering through ArrayList of Roomobjects,
//      collecting them to a set and displaying the reuslt row by row.
        List<Room> availableRoom =
         hotel.stream()
               .filter((r) -> (r.roomName.equals(choice)))
                .filter((r) -> ((r.isRoomAvailable==true)))
                 .collect(Collectors.toList());
        System.out.println("\nFollowing "+choice+"s are available");
        for (Room r : availableRoom)               
            System.out.println("RoomID: " + r.roomID);          
    }
    
    public static void bookRoom() throws SQLException{      // author C. Carboo
        Connection connection = null;
        Statement sqlStatement = null;
        PreparedStatement prepStat;
//      Prompting user to choose if to continue to booking or not. If so, user gives roomID.
//      Searching through the arrayList for matching room ID, setting equivalent room to not available.
        boolean exit=false;
        do {
            System.out.print("\nTo continue to booking enter Y (yes). \nIf not, enter N (no): ");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")){                
                System.out.print("\nEnter desired room ID: ");
                String roomID = input.nextLine();
                System.out.print("\nEnter customer ID: ");
                int customerID = input.nextInt();
                input.nextLine();
                CheckOut bookedRoom = new CheckOut(customerID, roomID);
                
                for (Room room : hotel) {
                    if (room.roomID.equalsIgnoreCase(roomID)) {
                        room.setIsRoomAvailable(false);                        
                        bookedRoom.setChargePerDay(room.getChargePerDay());
                        bookedRoom.setBookStart();                        
                        bookedRoom.setBookEnd();                     
                        bookedRoom.setSumDays(bookedRoom.getBookStart(), bookedRoom.getBookEnd());
                        bookedRoom.setSumChargePerDays(room.getChargePerDay(), bookedRoom.getSumDays());
                        System.out.println("\nBooking looks like: " + bookedRoom);
                        
                        System.out.println("\nStoring booking information on database...");
                        //prepared statement for database
                        //Table room, values to fill: roomId, roomName, ChargePerDay.....and eventually: available 
  /*Kolla om detta är rätt sätt att skriva?*/prepStat = connection.prepareStatement("UPDATE room WHERE roomID ? VALUE(?)");
                        prepStat.setString(1, room.getRoomID());
                        prepStat.setInt(4, 0);  // SQL column available är en boolean, men visar 1 för true och 0 för false.                      
                        
                        
                        //Values to fill: roomId, Bookings_date, numbersOfDays, checkout_date, total_cost
                        prepStat = connection.prepareStatement("INSERT INTO roomscheckout VALUES(?,?,?,?)");
                        prepStat.setString(1, bookedRoom.getRoomID());
                        prepStat.setObject(2, bookedRoom.getBookStart());
                        prepStat.setInt(1, bookedRoom.getSumDays());
                        prepStat.setObject(1, bookedRoom.getBookEnd());
                        prepStat.setInt(1, bookedRoom.getSumChargePerDays());
                        prepStat.executeUpdate();
                        connection.close();
                        System.out.println("\nDatabase is up to date!");
                        
                        System.out.println("\nRoom \""+roomID+"\" has now been booked, is room available for others to book? Result: \n"+room.isRoomAvailable);
                        bookedRoom.printReceipt();                        
                        exit = true;
                    }
                }
                
                
            }else
                exit = true;
            
        } while (!exit);       
    }
}


package hotel;

import static hotel.Room.input;
import java.sql.SQLException;
import java.util.*;


public class Menu {
    final static String boldTextStart = "\033[1m";
    final static String regularTextStart = "\033[0m";
    final static String newLine = "\n";
    private static boolean exit = false;
    private static Scanner input = new Scanner(System.in);
   
   
   public static void BookingsMenu(){
        

        while (true) {
           System.out.println("Make your choice!");
                System.out.println("1. Display room details");
                System.out.println("2. Display room availability");
                System.out.println("3. Order food");
                System.out.println("4. Back to start menu");
            

            // Ta in text från användaren
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toLowerCase(); // Omvandla input till lower case för jämförelse

            if (userInput.equals("1") || userInput.contains("details")) {
                System.out.println(newLine + "Room details selected");
                Room.generateHotel();
                Room r = new Room();
                Room sd = new RoomSingleDeluxe();
                RoomDoubleDeluxe d = new RoomDoubleDeluxe();
                RoomLuxury l = new RoomLuxury();
                Room.genericDisplayMethod(r, sd, d, l);

            } else if (userInput.equals("2") || userInput.contains("Availability")) {
                
                System.out.println(boldTextStart + "Room availability selected" + regularTextStart);
                
                Room.roomAvailability();

            } else if (userInput.equals("3") || userInput.contains("Food")) {               
                Food.foodMenu();

            } else if (userInput.equals("4") || userInput.contains("exit") || userInput.contains("quit")) {
                break; // Gå tillbaka till start menu
            } else {
                System.out.println("Unknown input. Try again!" + newLine);
            }
        }

   }
 
   
}

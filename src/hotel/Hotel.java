
package hotel;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hotel{
    
    
public static void main(String[] args) {
        
       

//                Room r = new Room();
//                Room sd = new RoomSingleDeluxe();
//
//     Booking.printReceipt(r,sd);
          
}

    public static void startMenu() {
        while (true) {
                System.out.println("Welcome to Elite Hotel !");
                System.out.println("Make your choice!");
                System.out.println("1.Customers menu");
                System.out.println("2.Reception");              
                System.out.println("3.Exit");

            // Ta in text från användaren
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toLowerCase();
            
            // Hantera input val
            if (userInput.equals("1") || userInput.contains("menu")) {
                System.out.println("Customers menu selected\n");
                Menu.customersMenu();
            } else if (userInput.equals("2") || userInput.contains("Reception")) {
                System.out.println("Reception selected\n");
            } else if (userInput.equals("3") || userInput.contains("exit") || userInput.contains("quit")) {
                System.out.println("Thank you for you choosing Elite Hotel");
                break;
            } else { // Om ingen match hittas, visa felmeddelande
                System.out.println("Unknown input. Try again!\n");
            }
        }

    }




}


package hotel;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hotel{
    
    
public static void main(String[] args) {
    Customer.CustomerInput();
                      
//       Room.generateHotel();
       
       
//    Menu m = new Menu();
//        System.out.println("Menu class" + m);
//
//    Food f = new Food();
//        System.out.println("class food:" + f);
    
    
startMenu();
          
}

    public static void startMenu() {
        while (true) {
                System.out.println("Welcome to Elite Hotel !");
                System.out.println("Make your choice!");
                System.out.println("1.Room booking");
                System.out.println("2.Checkout");              
                System.out.println("3.Exit");

            // Ta in text från användaren
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toLowerCase();
            
            // Hantera input val
            if (userInput.equals("1") || userInput.contains("menu")) {
                System.out.println("Room booking selected\n");
                
                Menu.BookingsMenu();
            } else if (userInput.equals("2") || userInput.contains("Checkout")){
                System.out.println("Checkout selected\n");
            } else if (userInput.equals("3") || userInput.contains("exit") || userInput.contains("quit")) {
                System.out.println("Thank you for you choosing Elite Hotel");
                break;
            } else { // Om ingen match hittas, visa felmeddelande
                System.out.println("Unknown input. Try again!\n");
            }
        }

    }
    
    




}

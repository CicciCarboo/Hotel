
package hotel;

import java.util.*;

public class Menu {
    final static String boldTextStart = "\033[1m";
    final static String regularTextStart = "\033[0m";
    final static String newLine = "\n";
    private static boolean exit = false;
    private static Scanner input = new Scanner(System.in);
   public void menu(){
        //Customer view(skapa en meny för att välja mellan olika alternativ):
        while (!exit) {

                System.out.println("Make your choice!");
                System.out.println("1. Display room details");
                System.out.println("2. Display room availability");
                System.out.println("3. Book");
                System.out.println("4. Order food");
                System.out.println("5. Checkout");
                System.out.println("7. Back to start menu");

                int selection = input.nextInt();

                switch (selection) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                       
                        break;
                    case 4:
                       
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    default:
                        exit = true;
                }
            }
   }
}


package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Hotel{
    
    private static final String url = "jdbc:mysql://localhost:3306/Hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "Youkhanna86";
    private static Connection connection = null;
    private static Statement sqlStatement = null;
    
    public static void main(String[] args) throws SQLException {
    
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//
//            System.out.println("Connection Succeeded!");
//
//            sqlStatement = connection.createStatement();          
//
//
//    
//        while (true) {
//                System.out.println("Welcome to Elite Hotel !");
//                System.out.println("Make your choice!");
//                System.out.println("1.Room booking");
//                System.out.println("2.Checkout");              
//                System.out.println("3.Exit");
//
//            // Ta in text från användaren
//            Scanner scan = new Scanner(System.in);
//            String userInput = scan.nextLine().toLowerCase();
//            
//            // Hantera input val
//            if (userInput.equals("1") || userInput.contains("menu")) {
//                System.out.println("Room booking selected\n");
//                
//                Menu.BookingsMenu();
//            } else if (userInput.equals("2") || userInput.contains("Checkout")){
//                System.out.println("Checkout selected\n");
//            } else if (userInput.equals("3") || userInput.contains("exit") || userInput.contains("quit")) {
//                System.out.println("Thank you for you choosing Elite Hotel");
//                break;
//            } else { // Om ingen match hittas, visa felmeddelande
//                System.out.println("Unknown input. Try again!\n");
//            }
//        }
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            connection.close();
//        }  

            System.out.println("Connection Succeeded!");

            sqlStatement = connection.createStatement();          


    
        while (true) {
                System.out.println(">>>
                
                System.out.println("<*><*><*><*> Make your choice <*><*><*><*> ");
                
                System.out.println("Choose customer if your customer or choose reception if your hotel reception!");
                
                System.out.println("1.Customer!");
                System.out.println("2.Hotel reception!");              
                System.out.println("3.Exit");

            // Ta in text från användaren
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toLowerCase();
            
            // Hantera input val
            if (userInput.equals("1") || userInput.contains("Customers menu")) {
                System.out.println("Customer menu selected:");               
                Menu.BookingsMenu();
            } else if (userInput.equals("2") || userInput.contains("Receptions menu")){
                System.out.println("Receptions menu selected\n");
                Reception.ReceptionInput();
                Menu.BookingsMenu();
            } else if (userInput.equals("3") || userInput.contains("exit") || userInput.contains("quit")) {
                System.out.println("Thank you for you choosing Elite Hotel");
                break;
            } else { // Om ingen match hittas, visa felmeddelande
                System.out.println("Unknown input. Try again!\n");
            }
        }

        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }  

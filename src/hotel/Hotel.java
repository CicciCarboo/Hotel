
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
    
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            System.out.println("Connection Succeeded!");

            sqlStatement = connection.createStatement();          
  

            System.out.println("Connection Succeeded!");

            sqlStatement = connection.createStatement();          


    
        Menu.startMenu();

        }catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            connection.close();
//        }  
    }
}
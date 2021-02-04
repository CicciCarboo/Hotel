
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Hotel{
    
    private static final String url = "jdbc:mysql://localhost:3306/Hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "56ultra78Violett9";
    protected static Connection connection = null;
    protected static Statement sqlStatement = null;
    protected static PreparedStatement prepSt;
    protected static ResultSet rs;
    
    public static void main(String[] args) throws SQLException {
    
        
        }
    
    public static void connectDB(){
        
          try{
              connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Succeeded!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void closeConDB() throws SQLException{
         connection.close();
         System.out.println("Connection to database is closed.");
    }
}
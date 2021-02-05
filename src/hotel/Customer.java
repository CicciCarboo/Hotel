
package hotel;

import static hotel.Room.input;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
    
    private int custId;
    private String firstName;
    private String lastName;
    private String email;
    private static Statement sqlStatement = null;
    public Customer() {
    }
    
    
    public Customer(String firstName, int custId, String lastName){
        
        this.custId = custId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;    
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
    
    static void CustomersInput() throws SQLException{
        PreparedStatement prepStat;
        
        System.out.println("Create new customer!");
        input.nextLine();
        System.out.print("Write your FirstName: ");
        String firstName = input.nextLine();
        System.out.print("Write your LastName: ");
        String lastName= input.nextLine();
        System.out.print("Write your email address: ");
        String email = input.nextLine();
       
        int custId=0;
       Hotel.connectDB();

        prepStat = Hotel.connection.prepareStatement("INSERT INTO customers VALUE(?,?,?,?)"); 
                        prepStat.setInt(1, custId);
                        prepStat.setString(2, firstName);                       
                        prepStat.setString(3, lastName);                                   
                        prepStat.setString(4, email);         
            prepStat.executeUpdate();
        Hotel.closeConDB();
    }
}

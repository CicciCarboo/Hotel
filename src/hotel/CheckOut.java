
package hotel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cicci Carboo
 */
public class CheckOut {
    protected static Scanner input = new Scanner(System.in);
    protected static ResultSet result;
    protected static Statement sqlStatement;
    protected static PreparedStatement prepStat;
    protected static FileWriter fw;
    protected static BufferedWriter buffer;
    protected static String printOut;
    protected static String foodPrintOut;
    
    protected int bookingID;
    protected int customerID;
    protected String roomID;
    protected LocalDate bookStart;
    protected LocalDate bookEnd;
    protected int sumDays; // Subtract bookStart from bookEnd
    protected int chargePerDay;
    protected int sumChargePerDays; // chargePerNight times sumNights
//     ArrayList<Food> mealsOrdered = new ArrayList<>(); // List(arrayList?) with all orderd Food objects, put as stream, count their prices and amount of orders.
//     ArrayList<CheckOut> bookedDays = new ArrayList<>(); // List(arrayList?) with all orderd Booking object, put as stream, count their prices.
    protected int sumCostMeals = 0;

    public CheckOut(int customerID, String roomID) {
        this.customerID = customerID;
        this.roomID = roomID;
        
    }

    public CheckOut(int bookingID, int customerID, String roomID, LocalDate bookStart, LocalDate bookEnd, int sumNights, int chargePerNight, int sumChargePerNight, int sumCostMeals) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.roomID = roomID;
        this.bookStart = bookStart;
        this.bookEnd = bookEnd;
        this.sumDays = sumNights;
        this.chargePerDay = chargePerNight;
        this.sumChargePerDays = sumChargePerNight;
        this.sumCostMeals = sumCostMeals;
    }

    
    public int getBookingID() {
        
        return bookingID;
    }

    public void setBookingID(int bookingID) {
       // rs.stmt.executeQuery("SELECT bookingID FROM booking"); Use this command combined with "setBookingID"
        this.bookingID = bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public LocalDate getBookStart() {
        
        return bookStart;
    }

    public void setBookStart() {
        
        System.out.println("When do you want to begin your stay?");
        System.out.println("Enter date by the format of YYYY-MM-DD: ");
        try {
            String stringInput = input.nextLine();
            bookStart = LocalDate.parse(stringInput);
        } catch (Exception e) {
            System.err.println("Please use given format for your entry.");
        }
        
         
    }

    public LocalDate getBookEnd() {
        return bookEnd;
    }

    public void setBookEnd() {
        
        System.out.println("When do you want to check out?");
        System.out.println("Enter date by the format of: YYYY-MM-DD");            
        try {
            String stringInput = input.nextLine();
        bookEnd = LocalDate.parse(stringInput); 
        } catch (Exception e) {
        System.err.println("Please use given format for your entry.");
        }
    }

    public int getSumDays() {
        return sumDays;
    }

    public void setSumDays(LocalDate bookStart, LocalDate bookEnd) {
        
        sumDays = (int) DAYS.between(bookStart, bookEnd);
    }
    
    public int getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public int getSumChargePerDays() {
        return sumChargePerDays;
    }

    public void setSumChargePerDays(int sumChargePerDay, int sumDays) {
        sumChargePerDays = (sumChargePerDay*sumDays);
    }

    
    public int getSumCostMeals() {
        return sumCostMeals;
    }

    public void setSumCostMeals(int sumCostMeals) {
        this.sumCostMeals += sumCostMeals;
    }

    @Override
    public String toString() {
        return "Booking " + bookingID + ", customerID=" + customerID + ", roomID=" + roomID + ", bookStart=" + bookStart +
                ", bookEnd=" + bookEnd + ", sumNights=" + sumDays + ", chargePerNight=" + chargePerDay + 
                ", sumChargePerDays=" + sumChargePerDays + ".";//", mealsOrdered=" + mealsOrdered +  + ", sumCostMeals=" + sumCostMeals +", bookedNights=" + bookedDays +
    }        
                          
    public static void customerCheckOut() throws SQLException{
        
        String roomID ="";
        System.out.print("\nEnter booking ID: ");
        int roomscheckout_Id = input.nextInt();
        input.nextLine();        
       
// Make room available in checkout. Use the same query to get the info for the stream in bookingRoom searching for available rooms
        Hotel.connectDB();    
        printReceipt(roomscheckout_Id);

        sqlStatement = Hotel.connection.createStatement();
        
        result = sqlStatement.executeQuery("SELECT * FROM roomscheckout WHERE RoomsCheckout_id ="+roomscheckout_Id+"");
        while (result.next()) {            
            System.out.println("Record from booking nr: " + result.getString("RoomsCheckout_id")+", roomID: "+result.getString("roomId")+".");
            roomID = result.getString("roomId");
        }

        prepStat = Hotel.connection.prepareStatement("UPDATE room SET available = 1 WHERE roomID = ?");                                                                                                          
                        prepStat.setString(1, roomID);                                                                  
                        prepStat.executeUpdate();
                        System.out.println("\nRoom changed to AVAILABLE in database.");        
        Hotel.closeConDB();

    }
    
    public static void printReceipt(int roomscheckout_Id) throws SQLException{ //Not possible to print specific values from entire objects.
                          // better to stream object into, return a result and place it into the buffered writer!
        int custId=0;                                            
        //Hotel.connectDB();
        sqlStatement = Hotel.connection.createStatement();
        result = sqlStatement.executeQuery("SELECT * FROM roomscheckout WHERE RoomsCheckout_id ="+roomscheckout_Id+"");
        while (result.next()) {            
            System.out.println("Record from booking: " + result.getString("RoomsCheckout_id")+", "+result.getString("roomId")+", "+result.getString("custId")+
                    result.getString("Bookings_date")+", "+result.getString("numbersOfDays")+", "+result.getString("checkout_date")+", "+ result.getString("total_cost")+".");
            custId = Integer.parseInt(result.getString("custId"));
            printOut = "\n\n\t\t**** Thank you for staying at Elite Hotel ****\n\nRecord from booking: \nBooking number: " + result.getString("RoomsCheckout_id")+",\nCustomer ID: "+result.getString("custId")+"\nRoom number: "+result.getString("roomId")+"\nBooking date: "+
                    result.getString("Bookings_date")+"\nCheckout date: "+result.getString("checkout_date")+"\nTotal amount of nights booked: "+result.getString("numbersOfDays")+
                    "\nTotal cost for room: "+ result.getString("total_cost")+"SEK.\n\nFood orders:\n";
        }                
        sumFood(custId);
        
        //Hotel.closeConDB();                                            
        try {
              fw = new FileWriter("CheckOutReceipt.txt");
              buffer = new BufferedWriter(fw);
              String welcomeBack = "\n\n\n\t\t\t******** Welcome back! ********";
              
              buffer.write(printOut+foodPrintOut+welcomeBack);
              buffer.newLine();
              System.out.println("Printing out receipt successfully.");
              buffer.close();
              fw.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static void sumFood (int custId)throws SQLException{
        // Controll database for food orders from custID. If: do something, else: ignore and abort.
        //name, price, discount, custId
       // Hotel.connectDB();
        sqlStatement = Hotel.connection.createStatement();
        result = sqlStatement.executeQuery("SELECT * FROM food WHERE custId ="+custId+"");
        while (result.next()) {            
            System.out.println("Record from food orders: " + result.getString("name")+", price: "+result.getString("price")+", discount: "+
                    result.getString("discount")+", customer ID: "+result.getString("custId")+". ");
           
            foodPrintOut += "\nRecord from food orders: " + result.getString("name")+", price: "+result.getString("price")+", discount: "+
                    result.getString("discount")+", customer ID: "+result.getString("custId")+". ";
        }
        
        
       // Hotel.closeConDB();
    }
    
}


package hotel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Cicci Carboo
 */
public class CheckOut {
    static Scanner input = new Scanner(System.in);
    
    protected int bookingID;
    protected int customerID;
    protected String roomID;
    protected LocalDate bookStart;
    protected LocalDate bookEnd;
    protected int sumDays; // Subtract bookStart from bookEnd
    protected int chargePerDay;
    protected int sumChargePerDays; // chargePerNight times sumNights
     ArrayList<Food> mealsOrdered = new ArrayList<>(); // List(arrayList?) with all orderd Food objects, put as stream, count their prices and amount of orders.
     ArrayList<CheckOut> bookedDays = new ArrayList<>(); // List(arrayList?) with all orderd Booking object, put as stream, count their prices.
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
        System.out.print("Year by format YYYY: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Month in digits MM: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Day in digits DD: ");
        int day = input.nextInt();        
        input.nextLine();
        
        bookStart = LocalDate.of(year, month, day);
        
    }

    public LocalDate getBookEnd() {
        return bookEnd;
    }

    public void setBookEnd() {
        System.out.println("When do you want to check out?");
        System.out.print("Year by format YYYY: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Month in digits MM: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Day in digits DD: ");
        int day = input.nextInt();        
        input.nextLine();
        
        bookEnd = LocalDate.of(year, month, day);
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
        return "Booking " + bookingID + ", customerID=" + customerID + ", roomID=" + roomID + ", bookStart=" + bookStart + ", bookEnd=" + bookEnd + ", sumNights=" + sumDays + ", chargePerNight=" + chargePerDay + ", sumChargePerDays=" + sumChargePerDays + ", mealsOrdered=" + mealsOrdered + ", bookedNights=" + bookedDays + ", sumCostMeals=" + sumCostMeals + '}';
    }        
                          
    public static void customerCheckOut() throws SQLException{
        Statement sqlStatement = null;
        System.out.print("\nEnter booking ID: ");
        int RoomsCheckout_id = input.nextInt();
        input.nextLine();
        ResultSet rs = sqlStatement.executeQuery("SELECT * FROM booking WHERE bookingID " + RoomsCheckout_id);
        System.out.println("\nQuery:'SELECT * FROM booking'\n");
        
        while (rs.next()) {
            System.out.println("Result from booking query:" + rs);
        }
    }
    
    public void printReceipt(){ //Not possible to print specific values from entire objects.
                                                    // better to stream object into, return a result and place it into the buffered writer!
        
        try {
              FileWriter fw = new FileWriter("CheckOutReceipt.txt");
              BufferedWriter buffer = new BufferedWriter(fw);
              
              buffer.write("\n"+ toString());
              buffer.newLine();
              System.out.println("Printing out receipt successfully.");
              buffer.close();
              fw.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

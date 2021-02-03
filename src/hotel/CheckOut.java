/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cicci
 */
public class CheckOut {
    Scanner input = new Scanner(System.in);
    
    protected int bookingID;
    protected int customerID;
    protected String roomID;
    protected LocalDate bookStart;
    protected LocalDate bookEnd;
    protected int sumNights; // Subtract bookStart from bookEnd
    protected int chargePerNight;
    protected int sumChargePerNight; // chargePerNight times sumNights
     ArrayList<Food> mealsOrdered = new ArrayList<>(); // List(arrayList?) with all orderd Food objects, put as stream, count their prices and amount of orders.
     ArrayList<CheckOut> bookedNights = new ArrayList<>(); // List(arrayList?) with all orderd Booking object, put as stream, count their prices.
    protected int sumCostMeals;// -||-

    public CheckOut(int customerID) {
        this.customerID = customerID;
        
    }

    public CheckOut(int bookingID, int customerID, String roomID, LocalDate bookStart, LocalDate bookEnd, int sumNights, int chargePerNight, int sumChargePerNight, int sumCostMeals) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.roomID = roomID;
        this.bookStart = bookStart;
        this.bookEnd = bookEnd;
        this.sumNights = sumNights;
        this.chargePerNight = chargePerNight;
        this.sumChargePerNight = sumChargePerNight;
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

    public void setBookStart(LocalDate bookStart) {
        
        this.bookStart = bookStart;
    }

    public LocalDate getBookEnd() {
        return bookEnd;
    }

    public void setBookEnd(LocalDate bookEnd) {
        this.bookEnd = bookEnd;
    }

    public int getChargePerNight() {
        return chargePerNight;
    }

    public void setChargePerNight(int chargePerNight) {
        this.chargePerNight = chargePerNight;
    }

    public int getSumCostMeals() {
        return sumCostMeals;
    }

    public void setSumCostMeals(int sumCostMeals) {
        this.sumCostMeals = sumCostMeals;
    }
    
    
    
     Room r = new Room();
                Room sd = new RoomSingleDeluxe();
                RoomDoubleDeluxe d = new RoomDoubleDeluxe();
                RoomLuxury l = new RoomLuxury();
    
                
    public void bookingRoom(String roomID, int chargePerNight){
        
        System.out.println("Enter customer ID: ");
        int customerID = input.nextInt();
        input.nextLine();
        
        CheckOut b = new CheckOut(customerID);
        
        b.setRoomID(roomID);
        b.setChargePerNight(chargePerNight);
        b.setBookStart(2021-02-10);
        b.setBookEnd(20210210);
        bookedNights.add(b);
        
        
    }            
                
                
                
                
                
    public static <E> void printReceipt(E a, E b){ //Not possible to print specific values from entire objects.
                                                    // better to stream object into, return a result and place it into the buffered writer!
        Room r = new Room();
                Room sd = new RoomSingleDeluxe();
                RoomDoubleDeluxe d = new RoomDoubleDeluxe();
                RoomLuxury l = new RoomLuxury();
        /* get data from checkout
         for example 
            protected int sumNightsSpent= ...
            protected int total room cost = object.getPrice multiplied by nights booked.
        */
        
        try {
            
            // creating a text file to write the objects too.
//            FileOutputStream f = new FileOutputStream(new File("CheckOutReceipt.txt"));
//            ObjectOutputStream o = new ObjectOutputStream(f);
//            
//            //Write objects to file
//            o.writeObject(r);
//            o.writeObject(sd);
//            
//            o.close();
//            f.close();

              FileWriter fw = new FileWriter("CheckOutReceipt.txt");
              BufferedWriter buffer = new BufferedWriter(fw);
              
              buffer.write("\n"+a.toString()+"\n"+b.toString());
              buffer.newLine();
              System.out.println("Printing out receipt successfully.");
              buffer.close();
              fw.close();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

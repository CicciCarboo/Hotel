
package hotel;

import static hotel.Room.input;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Food {
    protected static Scanner input = new Scanner(System.in);
    protected static Statement sqlStatement;
    protected static PreparedStatement prepStat;
    protected static ResultSet result;
    
    
    protected String name = "food";
    protected int price = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", price=" + price + '}';
    }
public static void foodMenu() throws SQLException{
    Noodles n = new Noodles();
    PastaRs pr = new PastaRs();
    Sandwich s = new Sandwich();
    Drink d = new Drink();
    
    Room.genericDisplayMethod(n,pr, s, d);
    System.out.println();
    
    LinkedHashSet<Food> hs = new LinkedHashSet();
    
    hs.add(n);
    hs.add(pr);
    hs.add(s);
    hs.add(d);
    
//    for (Food f : hs)            
//        System.out.println(f); 
    
 //  n.discount();
        System.out.println("Enter customer ID: ");
        int custId = input.nextInt();
        input.nextLine();
        
        System.out.println("Select your order:");       
        System.out.println("1. Noodles! ");
        System.out.println("2. PastaRs!");
        System.out.println("3. Sandwich!");
        System.out.println("4. Drink");
         int val = input.nextInt();
         
         
         if(val == 1){
             System.out.println("You choosed Noodles and it costs 170: kr");
             n.regFood(custId);
         }else if (val == 2){
             System.out.println("You choosed PastaRs and it costs 160 kr: ");
             pr.regFood(custId);
         }else if (val == 3){
             System.out.println("You choosed Sandwich and it costs 150 kr: ");
             s.regFood(custId);
         }else if(val == 4){
             System.out.println("You choosed Drink and it costs 30 kr: ");
             d.regFood(custId);
         }else 
             System.out.println("Wrong input: Try again");

}

    public void regFood(int custId) throws SQLException{        
        
        System.out.println("Register order of " + getName()+ " to database.");
        
//        String name = getName();
//        int price = getPrice();
       Hotel.connectDB();

        prepStat = Hotel.connection.prepareStatement("INSERT INTO food (name, price, custId)VALUE(?,?,?)"); 
                        prepStat.setString(1, getName());
                        prepStat.setInt(2, getPrice());                       
                        prepStat.setDouble(3, custId);                                  
                              
            prepStat.executeUpdate();
        Hotel.closeConDB();
    }

  
   
}

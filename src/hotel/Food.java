
package hotel;

import static hotel.Room.input;
import java.util.LinkedHashSet;


public class Food {
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
public static void foodMenu(){
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
    
//    n.discount();
        System.out.println("Select your order:");
        System.out.println("1. Noodles! ");
        System.out.println("2. PastaRs!");
        System.out.println("3. Sandwich!");
        System.out.println("4. Drink");
         int val = input.nextInt();
         
         
         if(val == 1){
             System.out.println("You choosed Noodles and it costs 170: kr");
         }else if (val == 2){
             System.out.println("You choosed PastaRs and it costs 160 kr: ");
         }else if (val == 3){
             System.out.println("You choosed Sandwich and it costs 150 kr: ");
         }else if(val == 4)
             System.out.println("You choosed Drink and it costs 30 kr: ");
        else 
             System.out.println("Wrong input: Try again");

}

  
   
}

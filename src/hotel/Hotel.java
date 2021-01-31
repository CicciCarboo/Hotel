
package hotel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hotel{
    
    
public static void main(String[] args) {
      
                      
       Room.generateHotel();
       
       
    Menu m = new Menu();
        System.out.println("Menu class" + m);

    Food f = new Food();
        System.out.println("class food:" + f);
    
    Noodles n = new Noodles();
        System.out.println("class noodles:" + n);
        
    PastaRs pr = new PastaRs();
        System.out.println("class PastaRs:" + pr);
        
    Sandwich s = new Sandwich();
        System.out.println("class Sandwich:" + s);
        
    Drink d = new Drink();
        System.out.println("class Drink:" + d);
        


}


}


package hotel;

public class Noodles extends Food implements VipFood{

    public Noodles() {
        super.setName("Noodles");
        super.setPrice(170);
    }

    @Override
    public void discount() {
        double result = price * 0.95;
        System.out.println("You get 5 % discount and the new price is: " + result);
    }
  
   
    
}

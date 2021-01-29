
package hotel;

public class Drink extends Food{
    
    private final String name = "Drink";
    private final int price = 30;
    
    
    Drink() {
        this.setName("Drink");
        this.setPrice(30);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

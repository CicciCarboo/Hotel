
package hotel;

public class Sandwich extends Food {
    
    private final String name = "Sandwich";
    private final int price = 150;
    
    
    Sandwich() {
        this.setName("Sandwich");
        this.setPrice(150);
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

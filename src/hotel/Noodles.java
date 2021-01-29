
package hotel;

public class Noodles extends Food {
  
    private final String name = "Noodles";
    private final int price = 170;
    
    
    Noodles() {
        this.setName("Noodles");
        this.setPrice(170);
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


package hotel;

public class Food {
    private String name = "food";
    private int price = 10;

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

    
   
}


package hotel;

public class Drink extends Food{
    
    private String name;
    private int price;
    
    
    Drink() {
        super.setName("Drink");     
        super.setPrice(30);          
    }                               // "Drink(){}" är en parameterfri construktor. Om 
                                    // man vill använda keyword "this." kan man använda en construktor med parametrar.
                                    // Parametrarna i en construktor med parametrar har ofta samma namn på parametrarna 
                                    // som klassens instansvariabler.
                                    // Keyword "this." talar om för kompilatorn att det är instansvariabeln som ska få
                                    // konstruktorns parameter som värde. Annars blir kontruktorn förvirrad när de 
                                    // heter samma sak.    
//      Originalmetoden från Foodklassen
//     public void setPrice(int price) {
//        this.price = price;
//    }

    Drink (String name, int price) {
        
        this.name = name;
        this.price = price;       
    }
    
       
}

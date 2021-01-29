
package hotel;

public class Customer {
    
    private int custId;
    private String firstName;
    private String lastName;
    private int telNr;
    private String email;
    
    public Customer() {
    }
    
    
    public Customer(int custId, String firstName, String lastName, int telNr, String email){
        
        this.custId = custId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNr = telNr;
        this.email = email;    
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTelNr() {
        return telNr;
    }

    public void setTelNr(int telNr) {
        this.telNr = telNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", telNr=" + telNr + ", email=" + email + '}';
    }
    
    
}

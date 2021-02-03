
package hotel;

public class Reception {

    private int Reception_id;
    private String firstName;
    private String lastName;

    public Reception() {
    }

    public Reception(int Reception_id, String firstName, String lastName) {
        this.Reception_id = Reception_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getReception_id() {
        return Reception_id;
    }

    public void setReception_id(int Reception_id) {
        this.Reception_id = Reception_id;
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

    @Override
    public String toString() {
        return "Reception{" + "Reception_id=" + Reception_id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
}

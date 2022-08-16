public class Customer {

//    Properties
    int id;
    String firstName;
    String lastName;
    double heldMoney;
    String fullName;

    public Customer(String firstName, String lastName, double heldMoney){
        int min = 1;
        int max = 1000;
        this.id = (int)Math.floor(Math.random() * (max - min + 1) + min);
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
        this.fullName = firstName + lastName;
    }

//    Methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString(){
        return "Customer{" + "firstName='" + firstName + ", lastName='" + lastName + ", heldMoney=" + heldMoney + '}';
    }
}

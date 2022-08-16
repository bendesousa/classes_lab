public class Customer {

//    Properties
    int id;
    String firstName;
    String lastName;
    double heldMoney;
    String fullName;
    double subtractMoneyHeld;

    public Customer(String firstName, String lastName, double heldMoney){
        int min = 1;
        int max = 1000;
        this.id = (int)Math.floor(Math.random() * (max - min + 1) + min);
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
        this.fullName = firstName + " " + lastName;
        this.subtractMoneyHeld = (10000 - heldMoney);
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

    public double getHeldMoney() {
        return heldMoney;
    }

    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSubtractMoneyHeld() {
        return subtractMoneyHeld;
    }

    public void setSubtractMoneyHeld(double subtractMoneyHeld) {
        this.subtractMoneyHeld = subtractMoneyHeld;
    }

    @Override
    public String toString(){
        return "Customer{" + "firstName='" + firstName + ", lastName='" + lastName + ", heldMoney=" + heldMoney + '}';
    }
}

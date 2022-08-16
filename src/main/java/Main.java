public class Main {

    public static void main(String[] args) {
//        Account Class test
        Account myAccount = new Account("1", "Johnson", 300);
        int myBalance = myAccount.getBalance();

        System.out.println("Account Balance: " + myBalance);

//        Circle Class test
        Circle myCircle = new Circle(13);
        double radiusCircle = myCircle.getRadius();
        double circumferenceCircle = myCircle.getCircumference();

        System.out.println("Radius of the Circle: " + radiusCircle);
        System.out.println("Circumference of the Circle:" + circumferenceCircle);

//        Rectangle Class test
        Rectangle myRectangle = new Rectangle(12, 6);
        double lengthRectangle = myRectangle.getLength();
        double widthRectangle = myRectangle.getWidth();
        double perimeterRectangle = myRectangle.getPerimeter();
        double areaRectangle = myRectangle.getArea();
        double diagonalRectangle = myRectangle.getDiagonal();

        System.out.println("Length of the Rectangle: " + lengthRectangle);
        System.out.println("Width of the Rectangle: " + widthRectangle);
        System.out.println("Perimeter of the Rectangle: " + perimeterRectangle);
        System.out.println("Area of the Rectangle: " + areaRectangle);
        System.out.println("Diagonal of the Rectangle: " + diagonalRectangle);

//        Customer Class test
        Customer myCustomer = new Customer("John", "Smith", 1000);

        int customerId = myCustomer.getId();
        String firstName = myCustomer.getFirstName();
        String lastName = myCustomer.getLastName();
        double heldMoney = myCustomer.getHeldMoney();
        String fullName = myCustomer.getFullName();
        double subtractMoneyHeld = myCustomer.getSubtractMoneyHeld();

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer First Name: " + firstName);
        System.out.println("Customer Last Name: " + lastName);
        System.out.println("Customer Held Money: " + heldMoney);
        System.out.println("Customer Full Name: " + fullName);
        System.out.println("Customer value after subtracting money held: " + subtractMoneyHeld);
    }


}

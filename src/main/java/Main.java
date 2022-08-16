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

        System.out.println("Customer ID: " + customerId);
    }


}

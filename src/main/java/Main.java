public class Main {

    public static void main(String[] args) {
//        Account Class test
        Account myAccount = new Account("1", "Johnson", 300);
        int myBalance = myAccount.getBalance();

        System.out.println(myBalance);

//        Circle Class test
        Circle myCircle = new Circle(13);
        double radiusCircle = myCircle.getRadius();
        double circumferenceCircle = myCircle.getCircumference();

        System.out.println(radiusCircle);
        System.out.println(circumferenceCircle);

//        Rectangle Class test
        Rectangle myRectangle = new Rectangle(12, 6);
        double lengthRectangle = myRectangle.getLength();
        double widthRectangle = myRectangle.getWidth();
        double perimeterRectangle = myRectangle.getPerimeter();
        double areaRectangle = myRectangle.getArea();
        double diagonalRectangle = myRectangle.getDiagonal();

        System.out.println(lengthRectangle);
        System.out.println(widthRectangle);
        System.out.println(perimeterRectangle);
        System.out.println(areaRectangle);
        System.out.println(diagonalRectangle);
    }


}

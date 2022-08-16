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
        
    }


}

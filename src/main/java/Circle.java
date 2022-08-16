public class Circle {

//    Properties
    double radius;
    double circumference;

    public Circle (double radius){
        this.radius = radius;
        this.circumference = 2 * radius * Math.PI;
    }

//     Methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString(){
        return "Circle{" + "radius='" + radius + ", circumference=" + circumference + '}';
    }

}

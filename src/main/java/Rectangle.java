public class Rectangle {

//    Properties
    double length;
    double width;
    double perimeter;
    double area;
    double diagonal;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.perimeter = (2 * length) + (2 * width);
        this.area = length * width;
        this.diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

//    Methods


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString(){
        return "Rectangle{" + "length='" + length + ", width=" + width + '}';
    }
}

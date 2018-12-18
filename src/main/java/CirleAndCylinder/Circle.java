package CirleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "white";
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public String toString() {
        return "Color of Circle is "
                + getColor()
                + " ,it has radius = "
                + getRadius()
                + " and area = "
                + getArea();
    }
}

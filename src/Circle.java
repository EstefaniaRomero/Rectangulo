import java.util.Objects;

public class Circle {

    private double radius;
    private String color;

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

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color +  ", area= " + calculateAreaCircle() + '}' + '\n';
    }

    public double calculateAreaCircle(){

       return Math.PI * Math.pow(radius,2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 && getColor().equals(circle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getColor());
    }

}

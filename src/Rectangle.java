import java.util.Objects;

public class Rectangle {

    private String color;
    private double high;
    private double width;


    public Rectangle(String color, double high, double width) {
        this.color = color;
        this.high = high;
        this.width = width;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle that = (Rectangle) o;
        return high == that.high && width == that.width && Objects.equals(color, that.color);
    }

    public double calculateAreaRectangle(){

        return high * width;


    }

    @Override
    public int hashCode() {
        return Objects.hash(color, high, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "color='" + color + '\'' + ", high=" + high + ", width=" + width + ", area=" + calculateAreaRectangle() + '}' + '\n';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingDouble;


public class Main {

    public static void main(String[] args) {
        List<Rectangle> rectangles = buildRectangleList();
        List<Circle> circles = buildCircleList();
        System.out.println("Els 8 Rectangles son:" +'\n' + '\n' +rectangles);
        System.out.println("Els 8 Cercles son:" +'\n' + '\n' + circles);
        List<Rectangle> top5 = getTop5MaxAreaRectanle(rectangles);
        System.out.println("El Top 5 amb els rectangles amb les areas més grans son:" +'\n' + '\n' + top5 );
        List<Circle> top5Circles = getTop5MaxAreaCircle(circles);
        System.out.println("El Top 5 amb els Cercles amb les areas més grans son:" +'\n' + '\n' + top5Circles);


   }

    private static List<Circle> getTop5MaxAreaCircle(List<Circle> circles) {
        return circles.stream()
                .sorted(comparingDouble(Circle::calculateAreaCircle).reversed())
                .limit(5)
                .toList();

    }

    private static List<Rectangle> getTop5MaxAreaRectanle(List<Rectangle> rectangles) {
        return rectangles.stream()
                .sorted(comparingDouble(Rectangle::calculateAreaRectangle).reversed())
                .limit(5)
                .toList();

    }
    private static List<Circle> buildCircleList() {
        List<Circle> circles = new ArrayList<>();

        Circle circles1 = new Circle(52,"Red");
        Circle circles2 = new Circle(45,"Green");
        Circle circles3 = new Circle(78,"Black");
        Circle circles4 = new Circle(85,"White");
        Circle circles5 = new Circle(96,"Violet");
        Circle circles6 = new Circle(36,"Blue");
        Circle circles7 = new Circle(12,"Orange");
        Circle circles8 = new Circle(15,"Pink");

        circles.add(circles1);
        circles.add(circles2);
        circles.add(circles3);
        circles.add(circles4);
        circles.add(circles5);
        circles.add(circles6);
        circles.add(circles7);
        circles.add(circles8);

        return circles;
    }

    private static List<Rectangle> buildRectangleList() {
        List<Rectangle> rectangles = new ArrayList<>();

        Rectangle rectangle1 = new Rectangle("Red", 79,24);
        Rectangle rectangle2 = new Rectangle("Black", 46,10);
        Rectangle rectangle3 = new Rectangle("Yellow", 54,24);
        Rectangle rectangle4 = new Rectangle("Orange", 93,25);
        Rectangle rectangle5 = new Rectangle("Green", 94,26);
        Rectangle rectangle6 = new Rectangle("Pink", 99,27);
        Rectangle rectangle7 = new Rectangle("Violet", 97,27);
        Rectangle rectangle8 = new Rectangle("Blue", 85,28);

        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle4);
        rectangles.add(rectangle5);
        rectangles.add(rectangle6);
        rectangles.add(rectangle7);
        rectangles.add(rectangle8);

        return rectangles;

    }
}
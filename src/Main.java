import java.util.*;
public class Main {
    public static void main(String[] args) {
        Point p = new Point(1.5, 2.3);
        Circle c1 = new Circle(new Point(10,5), 8.0, "RED", true);
        Rectangle r1 = new Rectangle(new Point(10, 5), 8, 6, "RED", true);
        Square s1 = new Square(new Point(10, 5), 8, "RED", true);
        Rectangle r2 = new Rectangle(new Point(10.5, 5), 8, 6, "RED", true);
        Rectangle r3 = new Rectangle(new Point(10.5, 5), 8, 6, "BLUE", true);
        Layer layer = new Layer();
        layer.addShape(c1);
        layer.addShape(r1);
        layer.addShape(c1);
        layer.addShape(r1);
        layer.addShape(s1);
        layer.addShape(r2);
        layer.addShape(r3);
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
        System.out.println(r2.equals(r3));
    }
}
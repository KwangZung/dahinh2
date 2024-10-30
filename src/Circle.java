import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * new circle.
     */
    public Circle() {
    }

    /**
     * new circle.
     * @param radius r
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * new circle.
     * @param radius radius
     * @param color color
     * @param filled filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * new circle.
     * @param center c
     * @param radius r
     * @param color c
     * @param filled f
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get area.
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * get p.
     * @return p
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * get string.
     * @return string
     */
    @Override
    public String toString() {
        return "Circle[center=" + center.toString()
                + ",radius=" + String.format("%.1f", radius) + ",color="
                + color + ",filled=" + filled + "]";
    }

    /**
     * if equals.
     * @param o object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle c = (Circle) o;
        return this.center.equals(c.center) && this.radius == c.radius;
    }

    /**
     * get hashcode.
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }
}

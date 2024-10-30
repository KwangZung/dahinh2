import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * new rec.
     */
    public Rectangle() {
    }

    /**
     * new rec.
     * @param width width
     * @param length l
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * new rec.
     * @param color c
     * @param filled f
     * @param width w
     * @param length l
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * new rec.
     * @param topLeft topleft
     * @param width w
     * @param length l
     * @param color c
     * @param filled f
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * get area.
     * @return area
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * get p.
     * @return p
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * check equals.
     * @param o object
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) o;
        return this.topLeft == r.topLeft && this.width == r.width
                && this.length == r.length
                && Objects.equals(super.getColor(), r.getColor())
                && this.isFilled() == r.isFilled();
    }

    /**
     * get hashcode.
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.topLeft, this.length,
                this.width, super.getColor(), super.isFilled());
    }

    /**
     * to string.
     * @return string
     */
    @Override
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
                this.topLeft.toString(), this.width, this.length,
                super.getColor(), super.isFilled());
    }
}

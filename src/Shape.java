public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * new shape.
     */
    public Shape() {
    }

    /**
     * new shape.
     * @param color color
     * @param filled filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get area.
     * @return area
     */
    public abstract double getArea();

    /**
     * get perimeter.
     * @return perimeter
     */
    public abstract double getPerimeter();

    /**
     * to string.
     * @return string
     */
    public abstract String toString();
}

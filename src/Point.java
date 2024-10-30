import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * new p.
     * @param pointX x
     * @param pointY y
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance 2p.
     * @param newPoint newpoint
     * @return distance
     */
    public double distance(Point newPoint) {
        double disX = (this.pointX - newPoint.pointX);
        double disY = (this.pointY - newPoint.pointY);
        return Math.sqrt(disX * disX + disY * disY);
    }

    /**
     * if equals.
     * @param o o
     * @return if equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Point)) {
            return false;
        }

        Point p = (Point) o;
        return this.pointX == p.pointX
                && this.pointY == p.pointY;
    }

    /**
     * hash code.
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * to string.
     * @return string
     */
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }

}

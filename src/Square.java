import java.util.Objects;

public class Square extends Rectangle {
    /**
     * new square.
     */
    public Square() {
    }

    /**
     * new sqr.
     * @param side side
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * new sqr.
     * @param side side
     * @param color c
     * @param filled f
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * new sqr.
     * @param topLeft point
     * @param side s
     * @param color c
     * @param filled f
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Square)) {
            return false;
        }
        Square s = (Square) o;
        return this.getSide() == s.getSide() && super.getTopLeft().equals(s.getTopLeft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getTopLeft(), this.getSide());
    }

    @Override
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%b]",
                super.getTopLeft().toString(), this.getSide(),
                super.getColor(), super.isFilled());
    }
}

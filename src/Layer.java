import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * add shape.
     * @param shape shape
     */
    public void addShape(Shape shape) {
        if (shapes == null) {
            shapes = new ArrayList<>();
        }
        shapes.add(shape);
    }

    /**
     * remove object is circle.
     */
    public void removeCircles() {
        int numOfShapes = shapes.size();
        shapes.removeIf(s -> s instanceof Circle);
    }

    /**
     * get info.
     * @return info
     */
    public String getInfo() {
        StringBuilder res = new StringBuilder();
        res.append("Layer of crazy shapes:\n");
        for (Shape s : shapes) {
            res.append(s.toString() + "\n");
        }
        String respond = res.toString();
        return respond;
    }

    /**
     * remove dups.
     */
    public void removeDuplicates() {
        HashSet<Shape> uniqueShape = new HashSet<>();
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            Shape s = it.next();
            boolean flag = uniqueShape.add(s);
            if (!flag) {
                it.remove();
            }
        }
    }

}

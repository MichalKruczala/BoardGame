import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class BaseField implements Field{
    private Field up;
    private Field down;
    private Field left;
    private Field right;

    @Override
    public int getVisitedCount() {
        return visitedCount;
    }

    private int visitedCount;

    public void linkNeighbours(Field up, Field down, Field right, Field left) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public List<Field> getNeighbours() throws Exception {
        Field[] array = {up, down, left, right};
        return List.of(array);
    }

    public void visit() {
        if (!isMovable()) {
            throw new IllegalArgumentException("You shall not pass!!!");
        }
        visitedCount++;
    }


}

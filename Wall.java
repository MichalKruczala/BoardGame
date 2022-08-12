import java.util.List;

public class Wall extends BaseField implements Field {

    public boolean isMovable() {
        return false;
    }

    @Override
    public boolean isWinning() {
        return false;
    }


    @Override
    public List<Field> getNeighbours() throws Exception {

        throw new Exception("Its a wall");
    }
}
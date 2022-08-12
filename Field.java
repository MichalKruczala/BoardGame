import java.util.List;

interface Field {


    public boolean isMovable();

    public boolean isWinning();

    public List<Field> getNeighbours() throws Exception;

    void visit();
    int getVisitedCount();
}
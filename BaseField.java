public abstract class BaseField implements Field{
    private Field up;
    private  Field down;
    private  Field left;
    private Field right;
    public void linkNeighbours(Field up, Field down, Field right, Field left){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }
    public Field moveUp() throws Exception {
        return up;
    }

    public Field moveDown() throws Exception {
        return down;
    }

    public Field moveLeft() throws Exception {
        return left;
    }
    public Field moveRight() throws Exception {
        return right;
    }
}

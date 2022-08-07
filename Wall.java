public class Wall extends BaseField implements Field {

    public boolean isMovable() {
        return false;
    }

    @Override
    public boolean isWinning() {
        return false;
    }


    @Override
    public Field moveUp() throws Exception {

        throw new Exception("Its a wall");
    }
    @Override
    public Field moveDown() throws Exception {
        throw new Exception("Its a wall");

    }
    @Override
    public Field moveLeft() throws Exception {
        throw new Exception("Its a wall");

    }
    @Override
    public Field moveRight() throws Exception {
        throw new Exception("Its a wall");
    }
}
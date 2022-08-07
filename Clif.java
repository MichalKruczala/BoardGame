public class Clif extends BaseField implements  Field{


    public boolean isMovable() {
        return false;
    }

    @Override
    public boolean isWinning() {
        return false;
    }

    @Override
    public Field moveUp() throws Exception {

        throw new Exception("Its a Clif,wasted!!!!!!");
    }
    @Override
    public Field moveDown() throws Exception {
        throw new Exception("Its a Clif,wasted!!!!!!");

    }
    @Override
    public Field moveLeft() throws Exception {
        throw new Exception("Its a Clif,wasted!!!!!!");

    }
    @Override
    public Field moveRight() throws Exception {
        throw new Exception("Its a Clif,wasted!!!!!!");
    }
}

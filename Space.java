

public class Space extends  BaseField implements Field {

    public boolean isMovable() {
        return true;
    }

    @Override
    public boolean isWinning() {
        return false;
    }

}



interface Field {


    public boolean isMovable();

    public boolean isWinning();

    public Field moveUp() throws Exception;

    public Field moveDown() throws Exception;

    public Field moveLeft() throws Exception;

    public Field moveRight() throws Exception;
}

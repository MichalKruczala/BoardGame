public class WinningField extends BaseField{
        @Override
    public boolean isMovable() {
        return true;
    }

    @Override
    public boolean isWinning() {
        return true;
    }
}

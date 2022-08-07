public class Game {
    public static void main(String[] args) throws Exception {

        BaseField[][]board = new BaseField[4][4];
        board[0][0] = new Clif();
        board[0][1] = new Clif();
        board[0][2] = new Clif();
        board[0][3] = new Clif();
        board[1][0] = new Clif();
        board[1][1] = new Space();
        board[1][2] = new Wall();
        board[1][3] = new Clif();
        board[2][0] = new Clif();
        board[2][1] = new Space();
        board[2][2] = new WinningField();
        board[2][3] = new Clif();
        board[3][0] = new Clif();
        board[3][1] = new Clif();
        board[3][2] = new Clif();
        board[3][3] = new Clif();

        board[1][1].linkNeighbours(board[0][1],board[2][1],board[1][2],board[1][0]);
        board[1][2].linkNeighbours(board[0][2],board[2][2],board[1][3],board[1][1]);
        board[2][1].linkNeighbours(board[1][1],board[3][1],board[2][2],board[2][0]);
        board[2][2].linkNeighbours(board[1][2],board[3][2],board[2][3],board[2][1]);


        Field startingPoint = board[1][1];
        Field nextField = startingPoint.moveDown();
         nextField = nextField.moveRight();
         if (nextField.isWinning()){
             System.out.println("Huraaaaa");
         }



    }
}





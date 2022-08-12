import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class FileGameReader implements GameReader {
    private final String filePath;


    FileGameReader(String filePath) {

        this.filePath = filePath;
    }

    @Override
    public Field readStartPoint() throws IOException {
        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);


        Stream<String> lines = br.lines();
        String[] linesArray = lines.toArray((String[]::new));
        int x = linesArray.length;
        int y = linesArray[0].length();
        BaseField[][] board = new BaseField[x][y];

        BaseField strartingPoint = null;
        for (int i = 0; i < linesArray.length; i++) {
            String line = linesArray[i];
            for (int j = 0; j < line.length(); j++) {
                char character = line.charAt(j);

                board[i][j] = createField(character);
                if (character == 'E') {
                    strartingPoint = board[i][j];
                }
            }
        }
        linkField(board);
        return strartingPoint;

    }
    private void linkField(BaseField[][] fields) {
        for (int i = 1; i < fields.length - 1; i++) {
            BaseField[] row = fields[i];
            for (int j = 1; j < row.length - 1; j++) {
                BaseField up = fields[i-1][j];
                BaseField down = fields[i+1][j];
                BaseField right = fields[i][j+1];
                BaseField left = fields[i][j-1];
                fields[i][j].linkNeighbours(up,down,right,left);

            }
        }

    }

    private BaseField createField(char character) {
        return switch (character) {
            case 'C' -> new Clif();
            case 'W' -> new Wall();
            case 'E' -> new Space();
            case 'S' -> new Space();
            case 'P' -> new WinningField();
            default -> throw new IllegalArgumentException("unknown character");
        };
    }
}

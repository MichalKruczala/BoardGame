import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Game {
    public static void main(String[] args) throws Exception {
        GameReader gameReader = new FileGameReader("c://Projects/map1.txt");

        Field currentPoint = gameReader.readStartPoint();
        currentPoint.visit();
        while (!currentPoint.isWinning()) {

            List<Field> neighbours = currentPoint.getNeighbours();

            Stream<Field> stream =neighbours.stream();
            currentPoint = stream.filter(field -> field.isMovable())
                    .sorted(Comparator.comparingInt(Field::getVisitedCount))
                    .findFirst()
                    .get();
            currentPoint.visit();
        }
        System.out.println("Huraaaaa");

    }

}
// wzorzec dekorator !!! obadaÄ‡

// Waterfall waterfall = new Waterfall(123,345);
//  waterfall = new Waterfall(-234,456);
//   Waterfall first =  Waterfall.Create(123,123);
//  Waterfall second = new Waterfall(first);
//  Waterfall third = new Waterfall(-100.0,200);

//        System.out.println(waterfall.jakiStrumien());
//        System.out.println(waterfall.getPole()+ " pole");
//


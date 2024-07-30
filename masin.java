import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositionInput {

    public static List<Position> inputPosition() {
        Scanner scanner = new Scanner(System.in);
        List<Position> positionList = new ArrayList<>();

        System.out.println("Enter number of positions:");
        int numPositions = scanner.nextInt();

        for (int i = 0; i < numPositions; i++) {
            System.out.println("Enter x for position " + (i + 1) + ":");
            int x = scanner.nextInt();
            System.out.println("Enter y for position " + (i + 1) + ":");
            int y = scanner.nextInt();
            
            positionList.add(new Position(x, y));
        }

        return positionList;
    }

    public static void main(String[] args) {
        List<Position> positionList = inputPosition();

        // Print all positions
        for (Position position : positionList) {
            System.out.println(position);
        }
    }
}

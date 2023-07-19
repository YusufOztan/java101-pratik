package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowSize = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int colSize = scanner.nextInt();

        MineSweeper game = new MineSweeper(rowSize, colSize);
        game.run();
    }
}

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.print("Please enter the row number: ");
        row = scanner.nextInt();
        System.out.print("Please enter the column number: ");
        col = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row, col);

        mineSweeper.run();
    }
}
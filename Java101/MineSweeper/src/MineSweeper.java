import java.util.Scanner;
public class MineSweeper {
    int row, col;
    int mineNumber;

    String[][] gameMap = new String[row][col];
    String[][] mineMap = new String[row][col];
    // Constructor fonksiyonu yazıyoruz.
    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineNumber = (this.row * this.col) / 4;
        this.gameMap = new String[this.row][this.col];
        this.mineMap = new String[this.row][this.col];
    }

    // Mayın tarlasını oluşturuyoruz.
    public void gameMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.gameMap[i][j] = "-";
            }
        }
    }

    public void showGameMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Mayınları yerleştiriyoruz.
    public void mineMap() {
        int minePlace = 0;
        while (minePlace != mineNumber) {
            int mineRow = (int) (Math.random() * this.row);
            int mineCol = (int) (Math.random() * this.col);
            if (mineMap[mineRow][mineCol] != "*") {
                mineMap[mineRow][mineCol] = "*";
                minePlace++;
            }
        }

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (mineMap[i][j] != "*") {
                    mineMap[i][j] = "-";
                }
            }
        }
    }

    public void showMineMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Etraftaki mayın sayılarını hesaplıyoruz.
    public int neigboursMove(int userRow, int userCol) {
        int neigbour = 0;
        int minRow, maxRow;
        int minCol, maxCol;

        if (userRow == 0) {
            minRow = 0;
            maxRow = userRow + 1;

            if (userCol == 0) {
                minCol = 0;
                maxCol = userCol + 1;
            } else if (userCol == this.col - 1) {
                minCol = userCol - 1;
                maxCol = userCol;
            } else {
                minCol = userCol - 1;
                maxCol = userCol + 1;
            }
        } else if (userRow == this.row - 1) {
            minRow = userRow - 1;
            maxRow = userRow;
            if (userCol == 0) {
                minCol = 0;
                maxCol = userCol + 1;
            } else if (userCol == this.col - 1) {
                minCol = userCol - 1;
                maxCol = userCol;
            } else {
                minCol = userCol - 1;
                maxCol = userCol + 1;
            }
        } else {
            minRow = userRow - 1;
            maxRow = userRow + 1;
            if (userCol == 0) {
                minCol = 0;
                maxCol = userCol + 1;
            } else if (userCol == this.col - 1) {
                minCol = userCol - 1;
                maxCol = userCol;
            } else {
                minCol = userCol - 1;
                maxCol = userCol + 1;
            }
        }
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                if (mineMap[i][j].equals("*")) {
                    neigbour++;
                }
            }
        }

        return neigbour;
    }

    public void completeGameMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (this.gameMap[i][j].equals("-")) {
                    this.gameMap[i][j] = "*";
                }
            }
        }
    }


    public void run() {
        System.out.println("Welcome to the game! ");
        int userRow, userCol;
        Scanner scanner = new Scanner(System.in);
        int totalMove = (this.row * this.col) - mineNumber;
        gameMap();
        mineMap();
        showGameMap();

        while (totalMove != 0) {
            System.out.println("==================");
            System.out.print("Raw:");
            userRow = scanner.nextInt();
            System.out.print("Column:");
            userCol = scanner.nextInt();

            if (userRow < 0 || userRow > this.row || userCol > this.col || userCol < 0) {
                System.out.println("Please enter a number within the size range...");
            } else {
                if (mineMap[userRow][userCol].equals("*")) {
                    System.out.println("----game over-----");
                    System.out.println("========================");
                    for (int i = 0; i < this.row; i++) {
                        for (int j = 0; j < this.col; j++) {
                            System.out.print(this.gameMap[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    this.gameMap[userRow][userCol] = String.valueOf((neigboursMove(userRow, userCol)));
                    showGameMap();
                    totalMove--;
                }
            }
        }
        if (totalMove == 0) {
            System.out.println("\nCongratulations. You won the game");
            System.out.println("===================================");
            completeGameMap();
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    System.out.print(this.gameMap[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class mayinTarlasi {
    char gameZone[][];
    String numField[][];
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();

    public void run() {

        System.out.print("Please,enter the row:: ");
        int row = input.nextInt();
        System.out.print("Please,enter the column: ");
        int colum = input.nextInt();

        createGameZone(row, colum);
        addMines(row, colum);
        showField(row, colum);

        int size = row * colum;
        int loopRepeat = size - size / 4;
        System.out.println("==Game Start==");

        while (loopRepeat > 0) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    System.out.print(numField[i][j] + " ");
                }
                System.out.println();
            }

            int sum = 0;
            System.out.print("Enter the row: ");
            int row1 = input.nextInt() - 1;
            System.out.print("Enter the column: ");
            int colum1 = input.nextInt() - 1;
            if (row >= row1 && colum >= colum1 && row1 >= 0 && colum1 >= 0) {
                if (gameZone[row1][colum1] == '*') {
                    System.out.println("Game Over!");
                    break;
                } else {

                    if (row1 - 1 >= 0 && colum1 - 1 >= 0) {
                        if (gameZone[row1 - 1][colum1 - 1] == '*')
                            sum++;
                    }
                    if (row1 - 1 >= 0) {
                        if (gameZone[row1 - 1][colum1] == '*')
                            sum++;
                    }
                    if (row1 - 1 >= 0 && colum1 + 1 < colum) {
                        if (gameZone[row1 - 1][colum1 + 1] == '*')
                            sum++;
                    }
                    if (colum1 - 1 >= 0) {
                        if (gameZone[row1][colum1 - 1] == '*')
                            sum++;
                    }
                    if (colum1 + 1 < colum) {
                        if (gameZone[row1][colum1 + 1] == '*')
                            sum++;
                    }
                    if (row1 + 1 < row && colum1 - 1 >= 0) {
                        if (gameZone[row1 + 1][colum1 - 1] == '*')
                            sum++;
                    }
                    if (row1 + 1 < row) {
                        if (gameZone[row1 + 1][colum1] == '*')
                            sum++;
                    }
                    if (row1 + 1 < row && colum1 + 1 < colum) {
                        if (gameZone[row1 + 1][colum1 + 1] == '*')
                            sum++;
                    }

                    numField[row1][colum1] = String.valueOf(sum);
                }

            } else {
                System.out.println("You entered the wrong value.");
            }
            System.out.println("===============");
            loopRepeat--;

            if (loopRepeat == 0) {
                System.out.println("Congratulations,\nYou won the game!");

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < colum; j++) {
                        System.out.print(numField[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }

    public void createGameZone(int row, int colum) {  //Bu method ile oyun alanını olusturup "-" ile doldurduk.

        gameZone = new char[row][colum];
        numField = new String[row][colum];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                gameZone[i][j] = '-';
                numField[i][j] = "-";

            }
        }
    }

    public void addMines(int row, int colum) { //Bu method ile size yani row*colum'un 4 de biri kadar mayın koyuyoruz.

        int size = row * colum;
        int numMines = size / 4;


        for (int i = 0; i < numMines; i++) {

            int randomX = (int) (Math.random() * row);
            int randomY = (int) (Math.random() * colum);
            if (gameZone[randomX][randomY] == '*') {
                numMines++;
            } else {
                gameZone[randomX][randomY] = '*';
            }
        }
    }

    public void showField(int row, int colum) {   //Klasik Multi Array gosterme methodu mayınların konumunu
        System.out.println("Location of Mines");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(gameZone[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}


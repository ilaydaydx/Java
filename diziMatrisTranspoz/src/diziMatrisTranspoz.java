import java.util.Scanner;

public class diziMatrisTranspoz {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of row:");         //satır sayısı
        int row = inp.nextInt();
        System.out.println("Enter the number of column:");        //sütun sayısı
        int col = inp.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpose = new int[col][row];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0 ; j< matris[i].length ; j++) {
                System.out.print("Enter the number of Row: " + i + " - Column: " + j+"\t");
                matris[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpose[j][i] = matris[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

public class yildizElmasYapimi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the n (number of rows) : ");
        int row = inp.nextInt();


        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= (row - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=row-1;i>=1;i--)
        {
            for(int j=1;j<=row-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

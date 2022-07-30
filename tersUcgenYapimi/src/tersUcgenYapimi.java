import java.util.Scanner;

public class tersUcgenYapimi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the n (number of rows) : ");
        int row = inp.nextInt();

        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=row-i;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
                System.out.print("*");

            System.out.println();
        }
    }

}

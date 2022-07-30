import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1=0,n2=1,n3,number;
        System.out.println("Enter the number of elements in the Fibonacci series: ");
        number = inp.nextInt();
        System.out.println("-------------------------------");
        System.out.print("0 1");

        for (int i=2;i<=number;i++){
            n3=n1+n2;
            System.out.print(" "+n3 );
            n1=n2;
            n2=n3;
        }
    }
}

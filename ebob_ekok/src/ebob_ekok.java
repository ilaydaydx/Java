import java.util.Scanner;
// Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
public class ebob_ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2;
        boolean a = false;

        do {
            System.out.print("Enter the number of n1:");
            n1 = inp.nextInt();
            System.out.println("Enter the number of n2:");
            n2 = inp.nextInt();

            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Please enter the pozitive numbers.");
            } else {
                a = true;
            }
        } while (!a);
        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }
        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                int ebob = i;
                System.out.println("EBOB is:" + ebob);
                break;
            }
            i--;
        }
        int j = 1;
        while (j <= (n1 * n2)) {
            if (j % n1 == 0 && j % n2 == 0) {
                int ekok = j;
                System.out.println("EKOK is:" + ekok);
                break;
            }
            j++;
        }
    }
}

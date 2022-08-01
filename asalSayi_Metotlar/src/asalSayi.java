import java.util.Scanner;

public class asalSayi {
    static void prime() {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = inp.nextInt();

        if (number / number == 0) {
            System.out.println(number + " is the prime number.");
        } else if (number == 1) {
            System.out.println(number + " is not prime number.");
        } else {
            System.out.println(number + " is not prime number.");
        }
    }

    public static void main(String[] args) {
        prime();
    }
}

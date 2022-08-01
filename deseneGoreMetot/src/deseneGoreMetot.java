import java.util.Scanner;
public class deseneGoreMetot {

    static int negative(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return negative(x - 5);
        }
    }

    static int positive(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return positive(x + 5, y);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Sayiyi giriniz : ");
            int number = input.nextInt();

            positive(negative(number),number);

            if (number == 0){
                break;
            }

            System.out.println("\nCikmak icin 0'i giriniz.");
        }
    }
}

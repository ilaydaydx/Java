import java.util.Scanner;

//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
public class max_min {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, n, largestNumber = 0, smallestNumber = 0;
        System.out.println("Please enter how many numbers to enter: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter " + i + ". number:");
            number = inp.nextInt();
            if (i == 1) {
                largestNumber = number;
                smallestNumber = number;
            } else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
        }
        System.out.println("The largest number is :" + largestNumber);
        System.out.println("The smallest number is :" + smallestNumber);
    }
}

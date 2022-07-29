import java.util.Scanner;

/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
public class basamakSayiToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter the number:");
        int number = inp.nextInt();

        while (number != 0) {
            total += number % 10;
            number /= 10;
        }
        System.out.println(total);
    }
}

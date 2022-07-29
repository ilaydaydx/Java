import java.util.Scanner;
/*
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım.
(4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
 */
public class armstrongSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = inp.nextInt();
        int basNumber = 0, tempNumber = number, basValue, result = 0, basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is Armstrong number.");
        } else {
            System.out.println(number + " is not Armstrong number.");
        }
    }
}

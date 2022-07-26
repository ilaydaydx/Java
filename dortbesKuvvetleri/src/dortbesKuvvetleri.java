import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

public class dortbesKuvvetleri {
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = inp.nextInt();

        System.out.println("Multiples of 4:");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("Multiples of 5:");
        for (int k = 1; k <= number; k *= 5) {
            System.out.println(k);
        }
    }
}

import java.util.Scanner;

/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class dortBolunenToplam {
    public static void main(String[] args) {
        int number,sum=0;
        Scanner inp=new Scanner(System.in);

        do {
            System.out.println("Enter the number:");
            number= inp.nextInt();
            if (number%4==0){
                sum+=number;
            }
        }while (number%2==0);

        System.out.println("Sum of your enter numbers:"+sum);
    }
}

import java.util.Scanner;
/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
 */
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number,total=0;
        System.out.println("Enter the number:");
        number= inp.nextInt();
        if (number<0){
            System.out.println("Please enter the pozitive numbers.");
        } else {
            for (int i=1;i<number;i++){
                if (number%i==0){
                    total+=i;
                }
            }
            if (total==number){
                System.out.println(number+" is the perfect number.");
            }else {
                System.out.println(number+" is not perfect number.");
            }
        }
    }
}

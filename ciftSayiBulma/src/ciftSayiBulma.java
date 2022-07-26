import java.util.Scanner;
/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

public class ciftSayiBulma {
    public static void main(String[] args) {
        int number,piece=0,total=0;
        double avarage;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the number:");
        number= inp.nextInt();
        System.out.println("-------");

        for (int i=1;i<=number;i++){
            if ((i%3==0)&&(i%4==0)){
                total+=i;
                piece++;
                System.out.println(i);
            }
        }
        avarage=total/piece;
        System.out.print("\nAverage of numbers divisible by 3 and 4 up to the entered number:"+avarage);
        inp.close();
    }
}

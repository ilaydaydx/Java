import java.util.Scanner;
/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
public class usluSayiHesaplama_for {
    public static void main(String[] args) {
        int a, u, total = 1;

        // 3^4=3*3*3*3 yani 3 üssü alınan=a ; üs olan=4 olur.

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        a = inp.nextInt();
        System.out.println("Üs olan sayı:");
        u = inp.nextInt();

        for (int i=1;i<=u;i++){
            total*=a;
        }
        System.out.println("Cevap:"+total);
    }
}

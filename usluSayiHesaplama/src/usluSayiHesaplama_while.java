import java.util.Scanner;

public class usluSayiHesaplama_while {
    public static void main(String[] args) {
        int a, u, total = 1;

        // 3^4=3*3*3*3 yani 3 üssü alınan=a ; üs olan=4 olur.

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        a = inp.nextInt();
        System.out.println("Üs olan sayı:");
        u = inp.nextInt();

        int i = 1;
        while (i <= u) {
            total *= a;
            i++;
        }
        System.out.println("Cevap:" + total);
    }
}

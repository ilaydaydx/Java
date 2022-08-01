import java.util.Scanner;

public class deseneGoreMetot_Döngü {

    static void pattern() {
        Scanner inp = new Scanner(System.in);
        System.out.println("N number:");
        int n = inp.nextInt();
        int a = n;

        System.out.print(n + " ");
        for (int i = n; i >= 0; i--) {
            n -= 5;
            System.out.print(n + " ");
            if (n <= 0) {
                for (int j = n; j <= a; j++) {
                    n += 5;
                    System.out.print(n + " ");
                    if (n == a) {
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

N Sayısı : 10
Çıktısı : 10 5 0 5 10

N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25

N Sayısı : 5
Çıktısı : 5 0 5
 */
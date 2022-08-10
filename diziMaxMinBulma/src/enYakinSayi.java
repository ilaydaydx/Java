import java.util.Scanner;

public class enYakinSayi {

    //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        int[] arrMin = new int[arr.length];     //Algoritmik olarak dusundugumuzde verdigimiz sayıdan dusuk olanları bir Array yaparız.
        int[] arrMax = new int[arr.length];     //Buyuk olan sayıları da baska bir Array.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = inp.nextInt();

        int a = 0, b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                arrMax[a] = arr[i];           //Verilen sayidan buyuk olanlar icin olusturma sekli. a 0 dan baslayan index numarasi.
                a++;
            }
            if (arr[i] <= n) {
                arrMin[b] = arr[i];
                b++;
            }
        }

        int min = arrMax[0];
        int max = arrMin[0];

        for (int i : arrMax) {
            if (i < min && i > n) {        // İsin en can alici noktasi eger verdigimiz sayidan buyuk olanlari bir Array yaptiysak ki yaptik.
                min = i;                  //En buyuklerin oldugu Array icerisinde ki en kucuk sayi bizim verdiğimiz sayiya buyuk en yakin sayi olur.
            }
        }

        for (int i : arrMin) {
            if (i > max && i < n) {       //Ayni dusunme sekli ile dusunursen en kucuklerin arasından sectigimiz en buyuk sayi da kucuk en yakin sayi olur.
                max = i;
            }
        }

        System.out.println("The nearest number smaller than the entered number: " + max);
        System.out.println("The nearest number greater than the entered number: " + min);

    }
}

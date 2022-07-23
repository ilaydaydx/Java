import java.util.Scanner;

public class vucutKutleIndeksi {
    public static void main(String[] args) {
        double kg,m,indeks;
        Scanner inp=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        m= inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz:");
        kg= inp.nextDouble();

        indeks=kg/(m*m);

        System.out.println("Vücut Kitle İndeksiniz :"+indeks);

    }

}

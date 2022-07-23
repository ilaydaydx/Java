import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        /*
            Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
            programı yazın.
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8
            olarak KDV tutarı hesaplayan programı yazınız.
         */

        //değişkenler
        double kdv,kdvOran,kdvsizTutar,kdvliTutar;
        boolean kdvDurum;

        //kullanıcıdan veri almak
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the price:");
        kdvsizTutar= inp.nextDouble();

        //kdv durumu
        kdvDurum=(0<kdvsizTutar)&&(1000>kdvsizTutar);
        kdvOran=kdvDurum?0.18:0.08;

        //kdvli fiyat ayarlama
        kdv=kdvOran*kdvsizTutar;
        kdvliTutar=kdv+kdvsizTutar;

        System.out.println("Price without value added tax:"+kdvsizTutar);
        System.out.println("Value added tax:"+kdvOran);
        System.out.println("Value added tax amount:"+kdv);
        System.out.println("Price with value added tax:"+kdvliTutar);
    }
}

import java.util.Scanner;

public class taksiMeter {
    public static void main(String[] args) {

        double tutar=2.20,total,acılıs=10,km;

        Scanner inp=new Scanner(System.in);
        System.out.println("How many kilometers traveled:");
        km=inp.nextDouble();

        total=(km*tutar)+acılıs;
        total=(total<=20)?20:total;

        System.out.println("Kilometer:"+km);
        System.out.println("Opening fee:"+acılıs);
        System.out.println("Price per kilometer:"+tutar);
        System.out.println("FEE TO BE PAID:"+total);



    }
}

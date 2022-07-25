import java.util.Scanner;

public class sinifGecme_ifelse {
    public static void main(String[] args) {

        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        double math,physics,chemical,turkish,music,avarage=0;

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the math grade:");
        math=inp.nextDouble();
        if (!(math<0||math>100)){
            avarage=avarage+math;
        }else {
            avarage=0;
        }

        System.out.println("Enter the physics grade:");
        physics=inp.nextDouble();
        if (!(physics<0||physics>100)){
            avarage=avarage+physics;
        }

        System.out.println("Enter the chemical grade:");
        chemical=inp.nextDouble();
        if (!(chemical<0||chemical>100)){
            avarage=avarage+chemical;
        }

        System.out.println("Enter the turkish grade:");
        turkish=inp.nextDouble();
        if (!(turkish<0||turkish>100)){
            avarage=avarage+turkish;
        }

        System.out.println("Enter the music grade:");
        music=inp.nextDouble();
        if (!(music<0||music>100)){
            avarage=avarage+music;
        }

        avarage=avarage/5;
        System.out.println("Don't forget! You having a avarage of min 55 to pass the class..");
        System.out.println("Your avarage:"+avarage);

        if (avarage>=55){
            System.out.println("Congratulations,you passed the class!");
        }else {
            System.out.println("Sorry, you didn't pass the class!");
        }

    }
}

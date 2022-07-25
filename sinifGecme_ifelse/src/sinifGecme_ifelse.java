import java.util.Scanner;

public class sinifGecme_ifelse {
    public static void main(String[] args) {
        int mathematics, physics, turkish, chemistry, music;

        Scanner inp=new Scanner(System.in);

        System.out.println("Your math grade:");
        mathematics= inp.nextInt();

        System.out.println("Your physics grade:");
        physics= inp.nextInt();

        System.out.println("Your turkish grade:");
        turkish= inp.nextInt();

        System.out.println("Your chemistry grade:");
        chemistry= inp.nextInt();

        System.out.println("Your music grade:");
        music= inp.nextInt();

        double avarage=(mathematics+physics+turkish+chemistry+music)/5;

        System.out.println("Don't forget! You having a avarage of min 55 to pass the class..");
        System.out.println("Your avarage:"+avarage);

        if (avarage<=55){
            System.out.println("Congratulations,you passed the class!");
        }else {
            System.out.println("Sorry, you didn't pass the class!");
        }






    }
}

import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double pearkg,applekg,tomatoeskg,bananakg,eggplanetkg,total,p,a,t,b,e;
        Scanner inp=new Scanner(System.in);

        System.out.println("How many kilograms a pear:");
        pearkg= inp.nextDouble();

        System.out.println("How many kilograms a apple:");
        applekg= inp.nextDouble();

        System.out.println("How many kilograms a tomatoes:");
        tomatoeskg= inp.nextDouble();

        System.out.println("How many kilograms a banana:");
        bananakg= inp.nextDouble();

        System.out.println("How many kilograms a eggplanet:");
        eggplanetkg= inp.nextDouble();

        p=pearkg*2.14;
        a=applekg*3.67;
        t=tomatoeskg*1.11;
        b=bananakg*0.95;
        e=eggplanetkg*5.00;

        total=p+a+t+b+e;

        System.out.println("Total payable:"+total);
    }
}

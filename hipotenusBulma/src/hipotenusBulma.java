import java.util.Scanner;

public class hipotenusBulma {
    public static void main(String[] args) {
        /*

        double a,b,c;


        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of one side of the triangle:");
        a= inp.nextDouble();

        System.out.println("Enter the length of the other side of the triangle:");
        b= inp.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenus:"+c);

         */

        double a,b,c,u,perimeter,area;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the length a of the triangle:");
        a= inp.nextDouble();

        System.out.println("Enter the length b of the triangle:");
        b= inp.nextDouble();

        System.out.println("Enter the length c of the triangle:");
        c= inp.nextDouble();

        u=(a+b+c)/2;

        perimeter=2*u;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Perimeter:"+perimeter);
        System.out.println("Area:"+area);


    }
}

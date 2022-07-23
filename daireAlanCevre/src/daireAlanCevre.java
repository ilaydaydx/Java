import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {
        double area,perimeter,radius,pi=3.14,circlezonearea,centralangel;

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the radius length of the circle:");
        radius= inp.nextDouble();

        System.out.println("Enter the central angel of the circle:");
        centralangel= inp.nextDouble();

        area=pi*radius*radius;
        perimeter=2*pi*radius;
        circlezonearea=(area*centralangel)/360;

        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
        System.out.println("Circle zone area:"+circlezonearea);

    }
}

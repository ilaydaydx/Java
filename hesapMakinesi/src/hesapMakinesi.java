import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the number 1:");
        n1= inp.nextInt();
        System.out.println("Enter the number 2:");
        n2= inp.nextInt();

        System.out.println("Select the action you want to do:");
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Your choice:");
        select=inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Addition is:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction is:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication is:"+(n1*n2));
                break;
            default:
                System.out.println("Division is:"+(n1/n2));
                break;
        }

    }
}

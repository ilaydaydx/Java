import java.util.Scanner;

public class hesapMakinesi_dowhile {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("----------\nAddition:" + result + "\n----------");
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("----------\nSubtraction:" + result + "\n----------");
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("----------\nMultiplication:" + result + "\n----------");
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("This operation cannot be done. Please enter a number other than 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("----------\nDivision:" + result + "\n----------");
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("----------\nExponent Calculation:" + result + "\n----------");
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("----------\nFactorial:" + result + "\n----------");
    }

    static void mod(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n=scan.nextInt();
        System.out.println("Enter the second number:");
        int m= scan.nextInt();

        int result=n%m;
        System.out.println("----------\nMod is:" + result + "\n----------");
    }

    static void rectangular(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the long edge:");
        int n=scan.nextInt();
        System.out.println("Enter the short edge:");
        int m= scan.nextInt();

        System.out.println("----------\nRectangular area:"+ (m * n));
        System.out.println("Rectangular perimeter:"+(2 * (m + n))+"\n----------" );
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "\n1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6-Factorial\n"
                + "7- Get Mode\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Log out";
        System.out.println(menu);

        do {
            System.out.println("\nSelect the transaction:");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an invalid transaction.");
            }
        } while (select != 0);


    }
}

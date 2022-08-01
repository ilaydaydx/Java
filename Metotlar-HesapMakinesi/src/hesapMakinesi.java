import java.util.Scanner;

public class hesapMakinesi {

    static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("----------\nAddition:" + result + "\n----------");
        return result;
    }

    static int minus(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println("----------\nSubtraction:" + result + "\n----------");
        return result;
    }

    static int times(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println("----------\nMultiplication:" + result + "\n----------");
        return result;
    }

    static int divided(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("This operation cannot be done. Please enter a number other than 0.");
            return 0;
        }
        int result = firstNumber / secondNumber;
        System.out.println("----------\nDivision:" + result + "\n----------");
        return result;
    }

    static int power(int firstNumber, int secondNumber) {
        int result = 1;
        for (int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }
        System.out.println("----------\nExponent Calculation:" + result + "\n----------");
        return result;
    }

    static int mod(int firstNumber, int secondNumber) {
        int result = firstNumber % secondNumber;
        System.out.println("----------\nGet Mode:" + result + "\n----------");
        return result;
    }

    static void rectangular(int firstNumber, int secondNumber) {
        System.out.println("----------\nRectangular area:\n----------" + (firstNumber * secondNumber));
        System.out.println("----------\nRectangular perimeter:\n----------" + (2 * (firstNumber + secondNumber)));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "\n1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Get Mode\n"
                + "7- Rectangular Area and Perimeter Calculation\n"
                + "0- Log out";

        System.out.println(menu);

        while (true) {

            System.out.println("\nSelect the transaction:");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.println("Enter the first number:");
            int firstNumber = inp.nextInt();
            System.out.println("Enter the second number:");
            int secondNumber = inp.nextInt();


            switch (select) {
                case 1:
                    sum(firstNumber, secondNumber);
                    break;
                case 2:
                    minus(firstNumber, secondNumber);
                    break;
                case 3:
                    times(firstNumber, secondNumber);
                    break;
                case 4:
                    divided(firstNumber, secondNumber);
                    break;
                case 5:
                    power(firstNumber, secondNumber);
                    break;
                case 6:
                    mod(firstNumber, secondNumber);
                    break;
                case 7:
                    rectangular(firstNumber, secondNumber);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an invalid transaction.");
            }
        }
        System.out.println("Checked out. Bye!");
    }
}


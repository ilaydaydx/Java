import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int artik0, artik4, year;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = inp.nextInt();

        artik0 = year % 400;
        artik4 = year % 4;


        if ((artik0 == 0) || (artik4 == 0)) {
            System.out.println("This year is leap year.");
        } else {
            System.out.println("This year is not leap year.");
        }

    }
}

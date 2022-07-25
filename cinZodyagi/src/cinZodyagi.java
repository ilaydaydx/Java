import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int year, remain;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        year = inp.nextInt();

        remain = year % 12;

        if (remain == 0) {
            System.out.println("Your Chinese Zodiac Sign: Monkey");
        } else if (remain == 1) {
            System.out.println("Your Chinese Zodiac Sign: Rooster");
        } else if (remain == 2) {
            System.out.println("Your Chinese Zodiac Sign: Dog");
        } else if (remain == 3) {
            System.out.println("Your Chinese Zodiac Sign: Pig");
        } else if (remain == 4) {
            System.out.println("Your Chinese Zodiac Sign: Mice");
        } else if (remain == 5) {
            System.out.println("Your Chinese Zodiac Sign: Ox");
        } else if (remain == 6) {
            System.out.println("Your Chinese Zodiac Sign: Tiger");
        } else if (remain == 7) {
            System.out.println("Your Chinese Zodiac Sign: Rabbit");
        } else if (remain == 8) {
            System.out.println("Your Chinese Zodiac Sign: Dragon");
        } else if (remain == 9) {
            System.out.println("Your Chinese Zodiac Sign: Snake");
        } else if (remain == 10) {
            System.out.println("Your Chinese Zodiac Sign: Horse");
        } else if (remain == 11) {
            System.out.println("Your Chinese Zodiac Sign: Sheep");
        }
    }
}

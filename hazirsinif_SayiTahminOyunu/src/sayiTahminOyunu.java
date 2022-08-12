import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    /*
    Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
    tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        // double number=(int)(Math.random()*100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("\nPlease enter your estimate:");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You have entered too many incorrect entries.Remaining right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("You will be disqualified the next time you make a mistake.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations! You estimate is right.");
                isWin = true;
                break;
            } else {
                System.out.println("Your entered the wrong number.\n! CLUE !");
                if (selected > number) {
                    System.out.println(selected + " is greater than secret number.");
                } else {
                    System.out.println(selected + " is smaller than secret number.");
                }
                wrong[right++] = selected;
                System.out.println("Remaining right: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("\nSorry..You lost !");
            if (!isWrong){
                System.out.println("Your estimates: " + Arrays.toString(wrong));
            }
        }
        System.out.println("Secret number is: " + number);
    }
}

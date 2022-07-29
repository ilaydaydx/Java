import java.util.Scanner;

public class atmProjesi_SwithCase {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int select, balance = 1500,price;

        while (right > 0) {
            System.out.println("Your UserName:");
            userName = inp.nextLine();
            System.out.println("Your password:");
            password = inp.nextLine();
            if (userName.equals("sun") && password.equals("1234")) {
                System.out.println("You have logged into the system.");
                do {
                    System.out.println("--------------------");
                    System.out.println("Please select the action you want to do:");
                    System.out.println("\n1-Cash deposit.\n2-Withdraw money.\n3-Balance inquiry.\n4-Log out.");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Amount of money to be deposited:");
                            price= inp.nextInt();
                            balance += price;
                            System.out.println(price + " tl has been added to your account.\nYour new account balance: " + balance);
                            break;
                        case 2:
                            System.out.println("Amount of money to be withdrawn:");
                            price= inp.nextInt();
                            if (price <= balance) {
                                balance -= price;
                                System.out.println(price + " tl has been withdrawn from your account.\nYour new account balance: " + balance);
                            } else {
                                System.out.println("Your money is not enough.\nYour account balance:" + balance + " tl\nPlease withdraw money under the " + balance + " tl.");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is " + balance + " tl.");
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("You entered incorrectly. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked.Please contact the bank.  ");
                } else {
                    System.out.println("Your remaining right:" + right);
                }
            }
        }
    }
}

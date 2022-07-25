import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String password,userName,passwordReset,newPassword;

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter your username:");
        userName= inp.nextLine();

        System.out.println("Enter the password:");
        password= inp.nextLine();

        if (userName.equals("ilay") && password.equals("123456")){
            System.out.println("The username and password is correct.\nYou are logged in!");
        } else {
            System.out.println("You entered an incorrect password.\nIf you want to specify a new password,select \"no\" or \"yes\"");
            passwordReset= inp.nextLine();

            if (passwordReset.equals("no")){
                System.out.println("Login terminated.");
            } else if (passwordReset.equals("yes")) {
                System.out.println("Type your new password.");
                newPassword= inp.nextLine();
                if (newPassword.equals("123456")||newPassword.equals(password)){
                    System.out.println("Incorrect entry try again.");
                }else {
                    System.out.println("Your password has been successfully reset.");
                }
            }else{
                System.out.println("You made the wrong choice.");
            }
        }

    }
}

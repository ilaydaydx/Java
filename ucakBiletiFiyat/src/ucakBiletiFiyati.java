import java.util.Scanner;

public class ucakBiletiFiyati {
    public static void main(String[] args) {
        int type;
        double km, age, total,newtotal=0,top;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the distance in km:");
        km = inp.nextDouble();

        System.out.println("Enter the age:");
        age = inp.nextDouble();

        System.out.println("What is your travel type?:");
        System.out.println("1-One Way\n2-Round Trip");
        type = inp.nextInt();

        total = km * 0.10;

        if ((km > 0) && (age > 0)) {
            if (age < 12) {
                newtotal = total - (total * 0.2);
            } else if ((age >= 12) && (age < 24)) {
                newtotal = total - (total * 0.1);
            } else if ((age>=24)&&(age<=65)) {
                newtotal=total;
            } else if (age > 65) {
                newtotal = total - (total * 0.3);
            }if (type==2){
                newtotal=(newtotal-(newtotal*0.2))*2;
            } else if (type==1) {
                newtotal=newtotal;
            }
        }else {
            System.out.println("You entered wrong data.\nPlease enter positive value!");
        }

        System.out.println("Your ticket price:" + newtotal);
    }
}

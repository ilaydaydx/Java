import java.util.Scanner;
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

public class usYapanProgram {
    static int power(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base= inp.nextInt();
        System.out.println("Enter the exponent value: ");
        int exponent= inp.nextInt();

        int result=1;
        for (int i=1;i<=exponent;i++){
            result*=base;
            if (exponent==0){
                return 1;
            }
        }
        System.out.println("Result:"+result);
        return result;
    }

    public static void main(String[] args) {
     power();
    }
}

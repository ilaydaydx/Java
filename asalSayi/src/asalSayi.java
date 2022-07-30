public class asalSayi {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        for(int number=2;number<100;number++){
            int control=0;
            for (int i=2;i<number;i++){
                if (number%i==0){
                    control=1;
                    break;
                }
            }
            if (control==0){
                System.out.print(number+" ");
            }
        }

        System.out.print("\n--------------------------------");
    }
}

public class diziSayilariOrtalama {
    public static void main(String[] args) {
       /* int[] list={15,6,7,12,7,9,3};

        double sum=0.0;
        for (int i=0;i< list.length;i++){
            sum+=list[i];

        }
         double avarage=sum/ list.length;

        System.out.println("Sum: "+sum);
        System.out.println("Avarage: " +avarage);
        */

        int[] array = {1, 2, 3, 4};
        double total;
        double result = 0.0;
        for (int j : array) {
            result += 1 / j;
        }
        total = array.length / result;

        System.out.println("Harmonic Average = " + total);
    }
}

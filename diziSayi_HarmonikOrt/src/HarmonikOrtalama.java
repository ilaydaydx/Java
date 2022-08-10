public class HarmonikOrtalama {
    //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    public static void main(String[] args) {

        int[] list = new int[4];
        double result = 0.0;
        double answer;

        for (int i = 1; i < list.length; i++) {
            result += 1 / i;
        }
        answer = list.length / result;

        System.out.println("Harmonic formula answer:" + result);
        System.out.println("Harmonic Avarage is:" + answer);
    }
}

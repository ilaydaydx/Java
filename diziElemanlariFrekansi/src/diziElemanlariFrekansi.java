public class diziElemanlariFrekansi {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frekans = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (frekans[i] >= 1) {
                if (arr[i] != 0)
                    System.out.println("The number " + arr[i] + " is repeated " + frekans[i] + " times.");
            }
        }
    }
}


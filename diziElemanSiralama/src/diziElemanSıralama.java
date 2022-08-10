import java.util.Arrays;
import java.util.Scanner;

public class diziElemanSıralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = inp.nextInt();
        int liste[]=new int[size];

        for (int i=0;i< liste.length;i++){
            System.out.print((i+1)+". number:");
            liste[i]= inp.nextInt();
        }
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}


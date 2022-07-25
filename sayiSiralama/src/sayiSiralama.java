import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {

        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        int a,b,c;

        Scanner inp=new Scanner(System.in);
        System.out.println("Number 1:");
        a= inp.nextInt();

        System.out.println("Number 2:");
        b= inp.nextInt();

        System.out.println("Number 3:");
        c= inp.nextInt();

        if ((a>b)&&(a>c)){
            if ((b>c)){
                System.out.println("c<b<a");
            }else{
                System.out.println("b<c<a");
            }
        } else if ((b>a)&&(b>c)) {
            if ((a>c)){
                System.out.println("c<a<b");
            }else {
                System.out.println("a<c<b");
            }
        } else if ((c>a)&&(c>b)) {
            if ((a>b)){
                System.out.println("b<a<c");
            }else {
                System.out.println("a<b<c");
            }
        }
    }
}

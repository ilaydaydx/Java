import java.util.Scanner;

public class burcBulma_switchCase {
    public static void main(String[] args) {
        int month,day;
        Scanner inp=new Scanner(System.in);
        System.out.println("Months:\n1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December\n");
        System.out.println("Enter of number to your birtday month:");
        month=inp.nextInt();

        System.out.println("Enter the birthday day:");
        day=inp.nextInt();

        switch (month){
            case 1:
                if (day<22){
                    System.out.println("Your star sign is Capricorn");
                }else {
                    System.out.println("Your star sign is Aquarius");
                }break;
            case 2:
                if (day<20){
                    System.out.println("Your star sign is Aquarius");
                }else {
                    System.out.println("Your star sign is Pisces");
                }break;
            case 3:
                if (day<21){
                    System.out.println("Your star sign is Pisces");
                }else {
                    System.out.println("Your star sign is Aries");
                }break;
            case 4:
                if (day<22){
                    System.out.println("Your star sign is Aries");
                }else {
                    System.out.println("Your star sign is Taurus");
                }break;
            case 5:
                if (day<21){
                    System.out.println("Your star sign is Taurus");
                }else {
                    System.out.println("Your star sign is Gemini");
                }break;
            case 6:
                if (day<23){
                    System.out.println("Your star sign is Gemini");
                }else {
                    System.out.println("Your star sign is Cancer");
                }break;
            case 7:
                if (day<23){
                    System.out.println("Your star sign is Cancer");
                }else {
                    System.out.println("Your star sign is Leo");
                }break;
            case 8:
                if (day<23){
                    System.out.println("Your star sign is Leo");
                }else {
                    System.out.println("Your star sign is Virgo");
                }break;
            case 9:
                if (day<23){
                    System.out.println("Your star sign is Virgo");
                }else {
                    System.out.println("Your star sign is Libra");
                }break;
            case 10:
                if (day<23){
                    System.out.println("Your star sign is Libra");
                }else {
                    System.out.println("Your star sign is Scorpio");
                }break;
            case 11:
                if (day<22){
                    System.out.println("Your star sign is Scorpio");
                }else {
                    System.out.println("Your star sign is Sagittarius");
                }break;
            case 12:
                if (day<22){
                    System.out.println("Your star sign is Sagittarius");
                }else {
                    System.out.println("Your star sign is Capricorn");
                }break;
        }
    }
}

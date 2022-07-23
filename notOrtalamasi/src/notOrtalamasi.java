import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        // Scanner sınıfı
        Scanner keyboard = new Scanner(System.in);

        // Değişkenler
        int math, physics, chemical, turkish, history, music;

        // Kullanıcıdan veri alma
        System.out.print("Matematik notunu giriniz: ");
        math = keyboard.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        physics = keyboard.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chemical = keyboard.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkish = keyboard.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        history = keyboard.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = keyboard.nextInt();

        // Ortalama hesaplama
        double average = (math + physics + chemical + turkish + history + music) / 6d;

        // Geçme, kalma kontrolü ve durumu ekrana yazdırma
        System.out.println("Ortalama: " + average);
        System.out.println(average > 60 ? "Sınıfı Geçti" : "Sıfta Kaldı");

    }
}

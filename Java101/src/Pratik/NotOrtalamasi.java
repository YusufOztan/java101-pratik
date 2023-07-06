package Pratik;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik:");
        int m = input.nextInt();
        System.out.print("Fizik:");
        int f = input.nextInt();
        System.out.print("Kimya:");
        int k = input.nextInt();
        System.out.print("Türkçe:");
        int t = input.nextInt();
        System.out.print("Tarih:");
        int ta = input.nextInt();
        System.out.print("Müzik:");
        int mu = input.nextInt();

        double sonuc = (m+f+k+t+ta+mu) / 6;

        String info = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta kaldı";

        System.out.println("Ortalamanız:" + sonuc);
        System.out.println(info);

    }
}

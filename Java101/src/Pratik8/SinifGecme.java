package Pratik8;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int m, f, t, k, mu,toplamDers = 0,notToplam = 0 ;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik:");
        m = input.nextInt();
        if (m >= 0 && m <= 100) {
            notToplam += m;
            ++toplamDers;
        }
        System.out.print("Fizik:");
        f = input.nextInt();
        if (f >= 0 && f <= 100) {
            notToplam += f;
            ++toplamDers;
        }
        System.out.print("Türkçe:");
        t = input.nextInt();
        if (t >= 0 && t <= 100) {
            notToplam += t;
            ++toplamDers;
        }
        System.out.print("Kimya:");
        k = input.nextInt();
        if (k >= 0 && k <= 100) {
            notToplam += k;
            ++toplamDers;
        }
        System.out.print("Müzik:");
        mu = input.nextInt();
        if (mu >= 0 && mu <= 100) {
            notToplam += mu;
            ++toplamDers;
        }


        avg = notToplam / toplamDers;


        if (avg < 55) {
            System.out.println("Sınıfta Kaldınız.");
        } else {
            System.out.println("Tebrikler! Sınıfı Geçtiniz. ");
        }
    }
}

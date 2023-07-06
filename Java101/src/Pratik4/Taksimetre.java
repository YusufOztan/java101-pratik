package Pratik4;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmUcret=2.20,minTutar,mesafe,toplamUcret;
        int acilis = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafe(km):");

        mesafe = input.nextDouble();
        toplamUcret = acilis + (kmUcret*mesafe);
        minTutar = (toplamUcret < 20) ? 20 : toplamUcret;
        System.out.println("Taksimetre Tutarı: " + minTutar);
    }
}

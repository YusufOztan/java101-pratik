package Pratik6;

import java.util.Scanner;

public class Kitleİndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz(kg): ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}

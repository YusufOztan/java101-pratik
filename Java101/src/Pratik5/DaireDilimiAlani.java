package Pratik5;

import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        double r,a,pi=3.14,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez Açısının Ölçüsünü Giriniz: ");
        a = input.nextDouble();

        sonuc = (pi * (r*r)* a)/360;
        System.out.println("Daire Diliminin Alanı: " + sonuc);

    }
}

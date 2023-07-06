package Pratik3;

import java.util.Scanner;

public class UcgenAlanı {
    public static void main(String[] args) {
        int a,b,c;
        double u,cevre,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin Çevresi: "+ cevre);
        System.out.println("Üçgenin Alanı: "+ alan);


    }
}

package Odev5;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        double residual;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if(year%4==0){
            if(year%100==0 && year%400==0){
                System.out.print(year + " bir artık yıldır! ");
            } else if (year%100==0 && year%400 != 0) {
                System.out.println(year + " bir artık yıl değildir! ");
            } else {
                System.out.println(year + " bir artık yıldır! ");
            }
        } else {
            System.out.print(year+" bir artık yıl değildir! ");
        }
    }
}

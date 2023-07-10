package Odev3;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int dist,age,type;
        double amount,ageDiscount,typeDiscount,totalAmount = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        dist = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1=> Tek yön, 2=> Gidiş Dönüş): ");
        type = input.nextInt();


        if (dist>=0 && age>=0 && type == 1) {
            amount = dist * 0.10;
            totalAmount += amount;
            if (age<12){
                ageDiscount = amount * 0.50;
                totalAmount -= ageDiscount;
            } else if (age>=12 && age<=24) {
                ageDiscount = amount * 0.10;
                totalAmount -= ageDiscount;
            } else if (age>65) {
                ageDiscount = amount * 0.30;
                totalAmount -= ageDiscount;
            }
            System.out.println("Toplam Tutar = " + totalAmount + " TL");

        } else if (dist>=0 && age>=0 && type == 2) {
            amount = dist * 0.10;
            totalAmount += amount;
            if (age<12){
                ageDiscount = amount * 0.50;
                totalAmount -= ageDiscount;
            } else if (age>=12 && age<=24) {
                ageDiscount = amount * 0.10;
                totalAmount -= ageDiscount;
            } else if (age>65) {
                ageDiscount = amount * 0.30;
                totalAmount -= ageDiscount;
            }
            typeDiscount = totalAmount * 0.20;
            totalAmount -= typeDiscount;
            totalAmount *= 2;
            System.out.println("Toplam Tutar = " + totalAmount + " TL");
            
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}

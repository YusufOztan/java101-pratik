package Pratik11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Ay: ");
        month = input.nextInt();

        System.out.print("Doğdunuz Gün: ");
        day = input.nextInt();

        if(month == 1) {
            if(day>=1 && day<=31){
                if(day<=21){
                    burc = "Oğlak Burcu";
                } else {
                    burc = "Kova Burcu";
                }
            }else {
                isError = true;
            }

        } else if (month == 2) {
            if(day>=1 && day<=28) {
                if (day <= 19) {
                    burc = "Kova Burcu";
                } else{
                    burc = "Balık Burcu";
                }
            }else {
                isError = true;
            }

        } else if (month == 3) {
            if(day>=1 && day<=31){
                if (day <= 20) {
                    burc = "Balık Burcu";
                } else{
                    burc = "Koç Burcu";
                }
            } else {
                isError = true;
            }


        } else if (month == 4) {
            if(day>=1 && day<=30){
                if (day <= 20) {
                    burc = "Koç Burcu";
                } else{
                    burc = "Boğa Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 5) {
            if(day>=1 && day<=31){
                if (day <= 21) {
                    burc = "Boğa Burcu";
                } else{
                    burc = "İkizler Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 6) {
            if(day>=1 && day<=30){
                if (day <= 22) {
                    burc = "İkizler Burcu";
                } else{
                    burc = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 7) {
            if(day>=1 && day<=31){
                if (day <= 22) {
                    burc = "Yengeç Burcu";
                } else{
                    burc = "Aslan Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 8) {
            if(day>=1 && day<=31){
                if (day <= 23) {
                    burc = "Aslan Burcu";
                } else {
                    burc = "Başak Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 9) {
            if(day>=1 && day<=30){
                if (day <= 22) {
                    burc = "Başak Burcu";
                } else {
                    burc = "Terazi Burcu";
                }
            }else {
                isError = true;
            }

        } else if (month == 10) {
            if(day>=1 && day<=31){
                if (day <= 22) {
                    burc = "Terazi Burcu";
                } else {
                    burc = "Akrep Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 11) {
            if(day>=1 && day<=30){
                if (day <= 21) {
                    burc = "Akrep Burcu";
                } else{
                    burc = "Yay Burcu";
                }
            } else {
                isError = true;
            }

        } else if (month == 12) {
            if(day>=1 && day<=31){
                if (day <= 21) {
                    burc = "Yay Burcu";
                } else {
                    burc = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }

        } else {
            isError = true;
        }

        if(isError){
            System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz.");
        } else{
            System.out.println("Merhaba, burcunuz: " + burc);
        }
    }
}

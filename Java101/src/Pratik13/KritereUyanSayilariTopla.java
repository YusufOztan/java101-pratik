package Pratik13;

import java.util.Scanner;

public class KritereUyanSayilariTopla {
    public static void main(String[] args) {
        int n,total = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if(n%2==0){
                if(n%4==0){
                    total += n;
                }
            } else{
                break;
            }
        } while(n > 0);
        System.out.print("Sayıların Toplamı: " + total);
    }
}

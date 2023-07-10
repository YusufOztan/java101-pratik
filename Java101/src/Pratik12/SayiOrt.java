package Pratik12;

import java.util.Scanner;

public class SayiOrt {
    public static void main(String[] args) {
        int number,total = 0,k = 0,avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i<number;i++){
            if(i%3==0 && i%4==0){
                total += i;
                System.out.println(total);
                k++;
            }
        }
        avg = total / k;
        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + avg);
    }
}

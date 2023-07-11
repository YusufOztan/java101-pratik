package Pratik14;

import java.util.Scanner;

public class DordunVeBesinKuvvetleri {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n = input.nextInt();

        for (int i = 1; i<=n; i*=4){
            System.out.println("4'ün Kuvvetleri: " + i);

        }
        for (int j = 1; j<=n; j*=5){
            System.out.println("5'in Kuvvetleri: " + j);
        }
    }
}

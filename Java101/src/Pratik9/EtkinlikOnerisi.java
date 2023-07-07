package Pratik9;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat > 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }if (heat <= 25 && heat >= 15){
            System.out.println("Pikniğe gidebilirsiniz.");
        }if (heat <= 15 && heat >= 5){
            System.out.println("Sinemaya gidebilirsiniz.");
        }if (heat <= 5){
            System.out.println("Kayağa gidebilirsiniz.");
        }
    }
}

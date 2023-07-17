package Odev6;

import java.util.Scanner;

public class FindsMinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much number will you enter: ");
        int n = scanner.nextInt();
        int min = 0;
        int max = 0;

        for(int i = 1; i <= n;i++){
            System.out.print("Please enter "+ i +". number: ");
            int value = scanner.nextInt();

            if(value>max){
                max = value;
            } else if(value<min){
                min = value;
            }
        }
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
    }
}

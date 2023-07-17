package Odev7;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int value = scanner.nextInt();
        int total = 0;

        for(int i = 1; i < value; i++){
            if(value % i == 0){
                total += i;
            }
        }
        if(total == value){
            System.out.println(value + " is a perfect number.");
        } else {
            System.out.println(value+" is not a perfect number.");
        }
    }
}

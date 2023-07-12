package Pratik17;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int a,Counter = 0,value,sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        a = scanner.nextInt();

        int tempNum = a;

        while (tempNum != 0){
            tempNum /= 10;
            Counter++;
        }

        tempNum = a;
        while (tempNum != 0) {
            value = tempNum % 10;
            sum += value;
            tempNum /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

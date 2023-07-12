package Pratik16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        int n,k,exNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number to be exponentiated: ");
        n = scanner.nextInt();

        System.out.print("Number to be exponent: ");
        k = scanner.nextInt();

        exNumber = 1;

        for(int i = 1; i <= k; i++){
            exNumber *= n;
        }
        System.out.println("Answer: " + n + "^" + k + "=" + exNumber);
    }
}

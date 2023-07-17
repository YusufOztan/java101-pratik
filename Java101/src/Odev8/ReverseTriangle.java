package Odev8;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the step number: ");
        int n = scanner.nextInt();

        for (int x = n-1; x>=0; x--) {
            for (int y = 0; y < (n - x); y++) {
                System.out.print(" ");
            }
            for (int j = (2 * x - 1); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

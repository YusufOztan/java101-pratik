package Pratik19;

import java.util.Scanner;

public class MakingDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the step number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k<= (n-i);k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i  - 1); j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int x = n-1; x>0; x--) {
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


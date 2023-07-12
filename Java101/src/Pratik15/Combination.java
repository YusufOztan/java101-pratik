package Pratik15;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n = scanner.nextInt();

        System.out.print("r : ");
        int r = scanner.nextInt();

        int totaln = 1;

        int totalr = 1;

        int totalnr = 1;

        for (int i = 1; i<=n ; i++){
            totaln = totaln * i;
        }

        for (int j = 1; j<=r ; j++){
            totalr = totalr * j;
        }

        for (int k = 1; k<=(n-r) ; k++){
            totalnr = totalnr * k;
        }

        System.out.println("C("+ n + "," + r + "): " + (totaln / (totalr*totalnr)) );
    }
}

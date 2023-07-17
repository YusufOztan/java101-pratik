package Odev9;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 0;
        for(int j = 2; j<100;j++){
            n = j;
            int count = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.print(n + " ");
            }

        }

    }
}

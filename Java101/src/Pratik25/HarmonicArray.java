package Pratik25;

public class HarmonicArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += ((double)numbers[i] / numbers.length);
            System.out.println(sum);
        }

        System.out.println(sum);
    }
}

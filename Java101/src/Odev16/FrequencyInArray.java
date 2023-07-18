package Odev16;

public class FrequencyInArray {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            int freq = 0;

            for (int j = 0; j < list.length; j++) {
                if (list[j] == element) {
                    freq++;
                }
            }
            
            for (int k = i - 1; k >= 0; k--) {
                if (list[i] == list[k]) {
                    freq = 0;
                    break;
                }
            }

            if (freq > 0) {
                System.out.println("Element " + element + " repeated " + freq + " times.");
            }
        }
    }
}

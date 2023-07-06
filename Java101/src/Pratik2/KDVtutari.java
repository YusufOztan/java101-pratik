package Pratik2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KDVtutari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat,kdv,kdvli;
        System.out.print("Ürünün Fiyatı:");
        fiyat = input.nextDouble();

        kdv = (fiyat < 1000) ? fiyat * 0.18 : fiyat * 0.08;

        kdvli = fiyat + kdv;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.printf("KDV tutarı: " + kdv);


    }
}

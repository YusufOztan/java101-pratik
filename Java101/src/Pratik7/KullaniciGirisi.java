package Pratik7;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,answer,newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Hoşgeldiniz! ");
        }else {
            System.out.println("Bilgileriniz Yanlış! ");
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz?(E/H): ");
            answer = input.nextLine();
            if (answer.equals("E") || answer.equals("e")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu.");
                }

            } else if (answer.equals("H") || answer.equals("h")) {
                System.out.println("Şifre yenileme isteği iptal edildi.");
            }
        }
    }
}

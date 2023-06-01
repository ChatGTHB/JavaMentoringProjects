package week2;

import java.util.Scanner;

public class _S3_IfElse {
    public static void main(String[] args) {

        String userName = "TechnoStudy";
        String password = "12345";

        // ORNEK SORU : Yukarıdaki kayıtlı bilgilere göre kullanıcıdan, kullanıcı adı ve şifre alarak// 4 farklı opsiyon için login işlemlerini yazınız.

        // 1.opsiyon - kullanıcı adı ve şifre hatalı
        // 2.opsiyon - şifre hatalı
        // 3.opsiyon - kullanıcı adı hatalı
        // 4.opsiyon - sisteme giriş başarılı.

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        String kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String sifre = input.nextLine();

        if (!userName.equals(kullaniciAdi) && !password.equals(sifre)) {
            System.out.println("Kullanıcı adı ve şifre hatalı");
        } else if (userName.equals(kullaniciAdi) && !password.equals(sifre)) {
            System.out.println("Şifre hatalı");
        } else if (!userName.equals(kullaniciAdi) && password.equals(sifre)) {
            System.out.println("Kullanıcı adı hatalı");
        } else {
            System.out.println("Sisteme giriş başarılı");
        }

    }
}
package groupMentoring;

import java.util.Scanner;

public class GroupMentoring_ATM2 {
    public static void main(String[] args) {
         /* Giris kismi :
        ATM ye gelen kişiyi Hosgeldiniz Mesaji ve Sifrenizi Giriniz gibi bir mesaj karsilasin

        Eger doğru sifre girerse asagidaki gibi Menu ciksin karsisina ve secim yapsin.
        Secimi yaptıktan sonra ise sadece bir mesaj versin şimdilik.
        (mesaji her menü seciminde  yazsin ekrana)
        Ornegin 2 tusuna bastigi zaman “2.Para Cekme Menüsündesiniz” gibi

        1 Kendi Hesabina Para yatirma
        2.Para Cekme
        3.Havale
        4.Sifre Degistirme
        5.Cikis

        Eger Hatali girer ise 3 kere giriş hakki olsun ve
        4. Giriş yaptigi zaman
        “ Üzgunum Cok sayida hatali giriş yaptiginiz için Kartiniza El konulmuştur
        Lütfen Subemizden geri aliniz”   mesajini göstersin ve ciksin.
        Her sifre girişinde ekranda kacinci girişi olduguda yazsin

         */


        Scanner input = new Scanner(System.in);
        int sifre = 0;
        int girisSayisi = 0;
        int menuSecim;
        int tanimliSifre = 12345;

        do {
            if (girisSayisi == 0) {
                System.out.println("--------------------------QABank ATM Hizmetleri ------------------------------");
                System.out.print("       ------------------------Hoşgeldiniz---------------------------" + "\n\nLütfen şifrenizi giriniz : ");
                sifre = input.nextInt();
                girisSayisi++;
                System.out.println("Giriş denemeniz : " + girisSayisi);
            } else {
                System.out.print("Hatalı giriş yaptınız." + "\nLütfen şifrenizi yeniden giriniz : ");
                sifre = input.nextInt();
                girisSayisi++;
                System.out.println("Giriş denemeniz : " + girisSayisi);

            }
        } while (sifre != tanimliSifre && girisSayisi <= 3);


        if (sifre == tanimliSifre) {
            System.out.print("Lütfen işlem yapmak istediğiniz menüyü seçiniz :\n" + "1.Kendi Hesabına Para Yatırma \n" + "2.Para Çekme \n" + "3.Havale \n" + "4.Şifre Degiştirme \n" + "5.Çıkış\n");
            menuSecim = input.nextInt();
            switch (menuSecim) {
                case 1:
                    System.out.println("1.Kendi Hesabına Para Yatırma Menüsündesiniz.");
                    break;
                case 2:
                    System.out.println("2.Para Çekme Menüsündesiniz.");
                    break;
                case 3:
                    System.out.println("3.Havale Menüsündesiniz.");
                    break;
                case 4:
                    System.out.println("4.Şifre Değiştirme Menüsündesiniz.");
                    break;
                case 5:
                    System.out.println("5.Çıkış Menüsündesiniz.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }
        } else {
            System.out.println(girisSayisi + ". şifre girişiniz." + "\nÜzgünüm çok sayıda hatalı giriş " + "yaptığınız için kartınıza el konulmuştur.\n" + "Lütfen şubemizden geri alınız.");
        }


    }

}
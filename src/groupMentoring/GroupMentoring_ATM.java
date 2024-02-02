package groupMentoring;

import java.util.Scanner;

public class GroupMentoring_ATM {
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

        System.out.println("--------------------------ATM------------------------------");
        System.out.print("Hoşgeldiniz.\nLütfen şifrenizi giriniz : ");
        int menuSecim;
        String sifre = "123";
        int counter = 1;

        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        String girilenSifre = inputStr.nextLine();

        if (sifre.equals(girilenSifre)) {
            System.out.println("1.Kendi Hesabına Para Yatırma \n" + "2.Para Çekme \n" + "3.Havale \n" + "4.Şifre Degiştirme \n" + "5.Çıkış\n" + "Lütfen işlem yapmak istediğiniz menüyü seçiniz :");
            menuSecim = inputInt.nextInt();
            if (menuSecim == 1) {
                System.out.println("1.Kendi Hesabına Para Yatırma Menüsündesiniz.");
            } else if (menuSecim == 2) {
                System.out.println("2.Para Çekme Menüsündesiniz.");
            } else if (menuSecim == 3) {
                System.out.println("3.Havale Menüsündesiniz.");
            } else if (menuSecim == 4) {
                System.out.println("4.Şifre Değiştirme Menüsündesiniz.");
            } else if (menuSecim == 5) {
                System.out.println("5.Çıkış Menüsündesiniz.");
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else {
            while (!sifre.equals(girilenSifre) && counter <= 3) {
                System.out.print(counter + ". şifre girişiniz.\nHatalı giriş yaptınız." + "\nLütfen şifrenizi yeniden giriniz : ");
                girilenSifre = inputStr.nextLine();
                counter++;
            }
            if (sifre.equals(girilenSifre)) {
                System.out.println("1.Kendi Hesabına Para Yatırma \n" + "2.Para Çekme \n" + "3.Havale \n" + "4.Şifre Degiştirme \n" + "5.Çıkış\n" + "Lütfen işlem yapmak istediğiniz menüyü seçiniz :");
                menuSecim = inputInt.nextInt();
                if (menuSecim == 1) {
                    System.out.println("1.Kendi Hesabına Para Yatırma Menüsündesiniz.");
                } else if (menuSecim == 2) {
                    System.out.println("2.Para Çekme Menüsündesiniz.");
                } else if (menuSecim == 3) {
                    System.out.println("3.Havale Menüsündesiniz.");
                } else if (menuSecim == 4) {
                    System.out.println("4.Şifre Değiştirme Menüsündesiniz.");
                } else if (menuSecim == 5) {
                    System.out.println("5.Çıkış Menüsündesiniz.");
                } else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            } else if (counter == 4) {
                System.out.println(counter + ". şifre girişiniz.\nÜzgünüm çok sayıda hatalı giriş " + "yaptığınız için kartınıza el konulmuştur.\n" + "Lütfen şubemizden geri alınız.");
            }
        }
    }
}






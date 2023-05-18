package week1;

import java.util.Scanner;

public class _20_11_2022 {
    public static void main(String[] args) {

        /*Ayse üniversitede okuyan bir ögrencidir. Bir sömestrda 2 adet sinav olacaktir.
        Yilsonu notunu hesaplayan kisa bir program yazalim.
        Girdigi ilk sinavin (vize) %40 i
        ikinci sinavin (final sinavi) %60 i notunu belirleyecektir.
        Iki sinavdan aldigi puan -->
        60-100 --> arasinda ise Tebrikler gectiniz
        40-60  --> arasinda ise  extra bütünleme sinavina girmelisiniz
        0-40 --> arasinda ise malesef ders tekrari yapmalisiniz yazsin*/

        Scanner input = new Scanner(System.in);

        System.out.print("Vize notunuzu 100'lük sisteme göre giriniz (0-100) : ");
        double vize = input.nextDouble();

        System.out.print("Final notunuzu 100'lük sisteme göre giriniz (0-100) : ");
        double final_ = input.nextDouble();

        double total = ((0.4 * vize) + (0.6 * final_));

        if (total <= 100 && total >= 60) {
            System.out.println("Notunuz : " + total + " \nTebrikler. Geçtiniz.");
        }
        if (total < 60 && total >= 40) {
            System.out.println("Notunuz : " + total + " \nExtra bütünleme sınavına girmelisiniz.");
        }
        if (total < 40 && total >= 0) {
            System.out.println("Notunuz : " + total + " \nMaalesef ders tekrarı yapmalısınız.");
        }
        if (total < 0 || total > 100) {
            System.out.println("Notunuz : " + total + " \nHatalı sonuç. \nVize ve final sınav sonuçlarınızı 100'lük sisteme göre giriniz. (0-100)");
        }
    }
}

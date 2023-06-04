package week2;

import java.util.Scanner;

public class _S4_IfElse {
    public static void main(String[] args) {
        /* Trafikte seyir halindeki kullanıcıdan trafik ışıklarından hangisinin yandığı bilgisini
         alıp yönlendirme yapan programı yazınız.*/

        Scanner input = new Scanner(System.in);

        System.out.print("Yanan trafik ışığını giriniz (Kırmızı/Sarı/Yeşil) :");
        String renk = input.nextLine();

        if (renk.equalsIgnoreCase("Kırmızı")) {
            System.out.println("Yol geçişe kapalı.");
        } else if (renk.equalsIgnoreCase("Sarı")) {
            System.out.println("Yol geçişe açılmak üzere");
        } else if (renk.equalsIgnoreCase("Yeşil")) {
            System.out.println("Yol geçişe açık");
        } else System.out.println("Hatalı giriş yaptınız. " +
                "Yanan trafik ışığını giriniz. (Kırmızı/Sarı/Yeşil)");


    }
}

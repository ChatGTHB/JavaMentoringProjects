package week3;

import java.util.Scanner;

public class _02_12_2022_Homework {
    public static void main(String[] args) {


        // Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.

        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumbers += i;
            } else {
                evenNumbers += i;
            }
        }
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("evenNumbers = " + evenNumbers);


        // Ödev Soru 2: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.

        // e
        // ye
        // iye
        // kiye
        // rkiye
        // ürkiye
        // Türkiye

        Scanner inputt = new Scanner(System.in);

        System.out.println("Enter a country : ");
        String country = inputt.nextLine();

        for (int i = country.length() - 1; i >= 0; i--) {
            System.out.println(country.substring(i));

        }

        // Ödev Soru3: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
        // Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

        Scanner input = new Scanner(System.in);
        int password = 0;
        int numberOfEntries = 0;
        int definedPassword = 12345;

        do {
            if (numberOfEntries == 0) {
                System.out.print("Enter your password : ");
                password = input.nextInt();
                numberOfEntries++;

            } else {
                System.out.print("You have entered incorrectly." + "\nPlease re-enter your password: ");
                password = input.nextInt();
                numberOfEntries++;
            }
        } while (password != definedPassword && numberOfEntries < 3);

        if (password == definedPassword) {
            System.out.print("Congratulations. Login successful.");
        } else {
            System.out.println(numberOfEntries + ". password login."
                    + " Sorry, your card has been blocked due to too many incorrect entries.");
        }


    }
}

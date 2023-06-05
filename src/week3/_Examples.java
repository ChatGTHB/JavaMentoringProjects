package week3;

import java.util.Scanner;

public class _Examples {
    public static void main(String[] args) {

        // Örnek 1 )- Verilen bir String ifadeyi tersten yazdırınız.

        String hello = "Merhaba Dünya";
        String reverseHello = "";
        for (int i = hello.length() - 1; i >= 0; i--) {
            reverseHello += hello.charAt(i);
        }
        System.out.println("reverseHello = " + reverseHello);


        // Örnek 2)- Verilen bir ifadenin palindrome olup olmadığını test eden bir program yazınız.

        String hello1 = "Merhaba Dünya";
        String reverseHello1 = "";
        for (int i = hello1.length() - 1; i >= 0; i--) {
            reverseHello1 += hello1.charAt(i);
        }

        if (reverseHello1.equals(hello1)) {
            System.out.println("The expression you entered is palindrome");
        } else {
            System.out.println("The expression you entered is not palindrome");
        }

        // Örnek 3)- Verilen bir syının faktöriyelini hesaplayan program yazınız.

        int number_ = 5;
        int factorial = 1;

        for (int i = 1; i <= number_; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);

        // Örnek 4)- Girilen bir sayının asal sayı olup olmadığını bulan bir program yazalım.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = input.nextInt();
        int counter = 2;
        int dividing = 0;

        while (counter < number) {
            if (number % counter == 0) {
                dividing++;
            }
            counter++;
        }
        if (number == 0 || number == 1 || number < 0) {
            System.out.println("The number entered is not a prime number. " +
                    "Enter a number of 2 or greater.");
        } else if (dividing == 0) {
            System.out.println("The number entered is a prime number.");
        } else System.out.println("The number entered is not a prime number.");

    }
}

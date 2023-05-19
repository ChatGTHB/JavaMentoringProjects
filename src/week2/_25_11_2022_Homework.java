package week2;

import java.util.Scanner;

public class _25_11_2022_Homework {
    public static void main(String[] args) {


        // Soru 1 : Kullanicidan bir not girmesini isteyen ve bu nota karsilik gelen harf notunu veren
        // programi yaziniz

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam grade according to the 100 system (0-100):");

        int examScoree = input.nextInt();
        System.out.println("Your exam score = " + examScoree);

        if (examScoree >= 90 && examScoree <= 100) {
            System.out.println("Your Success Grade = A");
        } else if (examScoree >= 80 && examScoree < 90) {
            System.out.println("Your Success Grade = B");
        } else if (examScoree >= 70 && examScoree < 80) {
            System.out.println("Your Success Grade = C");
        } else if (examScoree >= 60 && examScoree < 70) {
            System.out.println("Your Success Grade = D");
        } else if (examScoree >= 40 && examScoree < 60) {
            System.out.println("Your Success Grade = E");
        } else if (examScoree >= 0 && examScoree < 40) {
            System.out.println("Your Success Grade = F");
        } else System.out.println("You have entered incorrectly. " +
                "Enter a number between 0 and 100.");


        // Soru 2 : Girilen bir sayinin haftanin hangi gunune denk geldigini
        // yazdiran bir program yaziniz.(Switch ile)


        Scanner input2 = new Scanner(System.in);

        System.out.print("Day number = ");
        int dayNumber = input2.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("You have entered incorrectly."
                        + " Enter a number between 1 and 7.");

        }


    }
}

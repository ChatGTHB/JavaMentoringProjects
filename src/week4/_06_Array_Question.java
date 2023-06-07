package week4;

import java.util.Scanner;

public class _06_Array_Question {
    public static void main(String[] args) {

        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
        // Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran;
        // Sayi 0'dan kucuk ise hatalı giris yapıldigini belirtip yeniden sayi isteyen kodu yaziniz...

        Scanner input = new Scanner(System.in);
        int number = 0;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a positive number : ");
            number = input.nextInt();
            if (number < 0) {
                System.out.print("Incorrect entry. Enter a positive number : ");
                number = input.nextInt();
            }else if(number > 100) {
                System.out.println("The number you entered is greater than 100.");
                break;
            }else{
                total+=number;
            }

        }
        System.out.println("Total = " + total);


    }
}

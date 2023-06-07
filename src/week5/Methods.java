package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {


        //TODO calculator isminde bir method yaziniz parametre olarak iki tane int deger alsin ve 1 tane de string turunde bir parametre
        //  alsin ve string parametreye gore islem yapsin (topla,cikar,carp,bol  gibi)
         //  double sonuc=calculator(2,4,"topla");
//        System.out.println(calculator(12,4,"bol"));
       // System.out.println(calculator(12,4,"topla"));
//        System.out.println(calculator(12,4,"cikar"));
//        System.out.println(calculator(12,4,"carp"));
//        System.out.println(calculator(12,4,"carpg"));


        // TODO  soru 1 verilen deger uzunlugunda array ureten bir method yaziniz  ?
         int[] x = arrayUret(5);

        System.out.println(Arrays.toString(x));















        // TODO Method Soru 2 - Bir String de tum sesli harfleri sayan bir method yaziniz....
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println(countVowels(str));












        // TODO Method Soru 3 - Verilen 2 karakter arasinda kalan karakterleri yazdiran bir method yaziniz....

        // print_Chars('(', 'z');


        // TODO Method Soru 4 : Verilen bir dizide her elemanin kac defa tekrar ettigini veren bir method yaziniz..
        int[] numbers = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4};


    }

    public static double calculator(double  a, int b, String s) {

        return switch (s) {
            case "bol" -> a / b;
            case "topla" -> a + b;
            case "carp" -> a * b;
            case "cıkar" -> a - b;
            default -> 0;
        };


    }

    public static int[] arrayUret(int length){
        int[] sonuc=new int[length];
        return sonuc;
    }

    public static int countVowels(String str){
       // String[] value={"a","e","i","o","u"};
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u'){
                count++;
            }

        }


        return count;
    }
}
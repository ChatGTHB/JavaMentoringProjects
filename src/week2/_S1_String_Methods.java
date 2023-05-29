package week2;

public class _S1_String_Methods {
    public static void main(String[] args) {

        String word = "Techno Study";
        String number = "123";

        // Soru 1: Yukardaki Stringlerin uzunluğunu bulunuz.

        System.out.println("word.length() = " + word.length());
        System.out.println("number.length() = " + number.length());

        // Soru 2: Word String değerindeki tüm harfleri küçük harfe çeviriniz.

        System.out.println("word.toLowerCase() = " + word.toLowerCase());

        //Soru 3: Word String değerindeki tüm harfleri büyük harfe çeviriniz.

        System.out.println("word.toUpperCase() = " + word.toUpperCase());

        //Soru 4: Yukardaki Stringlerin "h" ve "H" harfini içerip içermediğini bulunuz.

        System.out.println("word.contains(\"h\") = " + word.contains("h"));
        System.out.println("word.contains(\"H\") = " + word.contains("H"));
        System.out.println("number.contains(\"h\") = " + number.contains("h"));
        System.out.println("number.contains(\"H\") = " + number.contains("H"));

        //Soru 5: "Techno" kelimesini ekrana yazdırınız.

        System.out.println("word.substring(0,6) = " + word.substring(0, 6));

        //Soru 6: Yukardaki iki String değeri tek değer haline getiriniz.

        System.out.println("word.concat(number) = " + word.concat(number));


    }
}

package week4;

public class _02_Nested_Example {
    public static void main(String[] args) {
        // Carpim Tablosunun tum sonuclarini (10x10)
        // ekrana yazdiran bir program yaziniz...


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));

            }
            System.out.println();
        }


    }
}

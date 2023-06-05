package week3;

public class _While_Do_While_Loops {
    public static void main(String[] args) {
        // While Loop

        int number = 1;
        while (number < 10) {
            System.out.println("number = " + number);
            number++;
        }

        // Do While Loop
        int sayac = 1;
        System.out.println("do while");
        do {
            System.out.println("sayac = " + sayac);
            sayac++;
        } while (sayac < 12);
    }
}

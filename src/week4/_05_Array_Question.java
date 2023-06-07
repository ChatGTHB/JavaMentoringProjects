package week4;

public class _05_Array_Question {
    public static void main(String[] args) {

        // Ornek 2: Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str += ch[i];
        }
        System.out.println(str);
    }
}

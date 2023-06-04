package week3;

public class _Break_Continue {
    public static void main(String[] args) {

        // break

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println("i = " + i);
                break;
            }
        }

        // continue

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                System.out.println("i = " + i);
                continue;
            }
        }


    }
}

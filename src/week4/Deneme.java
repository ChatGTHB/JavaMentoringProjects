package week4;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        // Ornek 4 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..

        int[] array = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4, 9, 7, 8, 2};
        int[] newArray = new int[array.length];
        int visited = -1;

        System.out.println("array = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    newArray[j] = visited;
                }
            }
            if (newArray[i] != visited)
                newArray[i] = count;
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != visited)
                System.out.println("array'de " + array[i] + " : " + newArray[i] + " adet bulunmaktadır.");
        }


    }
}

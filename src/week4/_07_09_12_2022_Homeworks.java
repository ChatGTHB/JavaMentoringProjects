package week4;

import java.util.Arrays;
import java.util.HashSet;

public class _07_09_12_2022_Homeworks {
    public static void main(String[] args) {

        // Ornek 4 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..

        int[] array = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4, 9, 7, 8, 2};
        int[] newArray = new int[array.length];
        int visited = -1;

        System.out.println("array = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    newArray[j] = visited;
                }
            }
            if (newArray[i] != visited)
                newArray[i] = count;
        }
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != visited)
                System.out.println("array'de " + array[i] + " : " + newArray[i] + " adet bulunmaktadır.");
        }

        //==========================The Second Solution==========================================\\

        /*
        int[] numbers = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4, 8, 45, 8, 8, 45, 8, 45, 7};
        TekrarEdenSayilar(numbers);
    }

    public static void TekrarEdenSayilar(int[] numbers) {
        HashSet<Integer> TumSayilar = new HashSet<>();
        HashMap<Integer, Integer> TumsayilarMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            TumSayilar.add(numbers[i]);
        }
        for (Integer a : TumSayilar) {
            int sayac = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == a) {
                    sayac++;
                    TumsayilarMap.put(a, sayac);
                }
            }
        }

        for (Map.Entry<Integer, Integer> kv : TumsayilarMap.entrySet()) {
            System.out.println("Sayi " + kv.getKey() + " - " + kv.getValue() + " adettir.");
        }

 */



        // Ornek 5 : Verilen bir Array de tekrar eden elemanlari yazdirin...

        int[] numbers2 = new int[]{2, 4, 6, 8, 4, 6, 10, 10};

        HashSet<Integer> tekrarsizList = new HashSet<>();
        HashSet<Integer> tekrarEdenSayilar = new HashSet<>();

        for (int i = 0; i < numbers2.length; i++) {
            if (!tekrarsizList.contains(numbers2[i])) {
                tekrarsizList.add(numbers2[i]);
            } else {
                tekrarEdenSayilar.add(numbers2[i]);
            }
        }
        System.out.println("Tekrar Eden Sayılar = " + tekrarEdenSayilar);


    }
}





















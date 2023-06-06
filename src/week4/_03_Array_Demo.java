package week4;

import java.util.Arrays;

public class _03_Array_Demo {
    public static void main(String[] args) {
        int sayi = 5;
        sayi = 4;

        int[] dizi = new int[5];//5 elemanli bir dizi tanimlandi
        dizi[0] = 8;
        dizi[1] = 7;
        dizi[2] = 6;
        dizi[3] = 5;
        dizi[4] = 4;
        // for (int i = 0; i < dizi.length ; i++) {
        // dizi[i]=5;
        // }

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        // System.out.println(dizi[1]);


        // System.out.println(dizi.length);
        // int dizi2[]=new int[]{1,2,3,4,5};
        // System.out.println(dizi2[2]);

        // sort
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}

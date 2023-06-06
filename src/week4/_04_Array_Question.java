package week4;

import java.util.Arrays;

public class _04_Array_Question {
    public static void main(String[] args) {
        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};

System.out.println("The First Solution : ");

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


System.out.println("The Second Solution : ");

        int theBiggest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>theBiggest){
                theBiggest=arr[i];
            }
        }
        System.out.println("The Biggest Number = " + theBiggest);
    }
}

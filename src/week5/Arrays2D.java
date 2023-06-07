package week5;

import java.util.Arrays;

public class Arrays2D {

    public static void main(String[] args) {

        // 2 boyutlu Array
//        int[][]numbers=new int[1][3];
//        numbers[0][0]=1;
//        numbers[0][1]=2;
//        numbers[0][2]=3;
//        System.out.println(Arrays.deepToString(numbers));

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j]+" ");
//                System.out.println();
//            }
//
//
//        }


//        double[][] doubleValues = {
//                {1.5, 2.6, 3.7},
//                {7.5, 6.4, 5.3},
//                {9.8,  8.7, 7.6},
//                {3.6, 5.7, 7.8}
//        };

//        String[][] stringValues;
//        stringValues = new String[][] {
//                {"working", "with"},
//                {"2D", "arrays"},
//                {"is", "fun"}
//        };

//        int[][] numberList = new int[3][4];     // { 10, 20, 30, 0 }
//        numberList[0][0] = 10;                  // { 40, 50, 60, 0 }
//        numberList[0][1] = 20;                  // { 0,  0,  0,  0 }
//        numberList[0][2] = 30;
//        numberList[1][0] = 40;
//        numberList[1][1] = 50;
//        numberList[1][2] = 60;
//        System.out.println(Arrays.deepToString(numberList));

//        int[][] numberList2 = { { 10,20,30 },
//                                { 40,50,60 }
//                              };
//        System.out.println(numberList2[0][1]);//20
//        System.out.println("numberList2[0] = " + Arrays.toString(numberList2[0]));

        // 2D Array elemanlarina tek tek ulasma...
//        for(int outer = 0; outer < numberList2.length; outer++){
//            System.out.println("The outer index is: " + outer);
//            for(int inner = 0; inner < numberList2[outer].length; inner++){
//                System.out.println("\tThe inner index is: " + inner);
//                System.out.println("\tArray Element is: "+numberList[outer][inner]);
//            }
//        }

        //TODO 4*4 bir int array tanimlayiniz ve random doldurup ekrana yazdiriniz 0 den 10'a kadar(10 dahil)?
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 11);
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));


    }
}

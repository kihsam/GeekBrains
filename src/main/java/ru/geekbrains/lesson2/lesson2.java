package ru.geekbrains.lesson2;

import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {

        // =====================  1 task =====================
        System.out.println(" =======  1 task ====== ");
        invertArray();
        System.out.println();

        // =====================  2 task =====================
        System.out.println(" =======  2 task ====== ");
        fillArray();
        System.out.println();

        // =====================  3 task =====================
        System.out.println(" =======  3 task ====== ");
        changeArray();
        System.out.println();

        // =====================  4 task =====================
        System.out.println(" =======  4 task ====== ");
        fillDiagonal();
        System.out.println();

        // =====================  5 task =====================
        System.out.println(" =======  5 task ====== ");
        maxMinInArray();
        System.out.println();

        // =====================  6 task =====================
        System.out.println(" =======  6 task ====== ");
        int [] arr = {2, 2, 2, 1, 2, 2,  10, 1};
        System.out.print(Arrays.toString(arr) + " = ");
        System.out.println(isSumLeftAndRightIsEqual(arr));

        // =====================  7 task =====================
        System.out.println(" =======  7 task ====== ");
        int n = 2;
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr2) + " = исходный масив");
        int[] x = shiftArrayToLeftOrRight(arr2, n);
        System.out.println(Arrays.toString(x) + " = смещение масива на " + n);
        n = -2;
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        x = shiftArrayToLeftOrRight(arr3, n);
        System.out.println(Arrays.toString(x) + " = смещение масива на " + n);


    }

    // =====================  1 task =====================

    public static void invertArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr[i] = 0;
            } else if (arr[i] != 1) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // =====================  2 task =====================
    public static void fillArray(){
        int[] arr = new int[8];
        for (int i = 0, j=0; i<arr.length;  i++, j+=3){
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    // =====================  3 task =====================
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) arr[i]*=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    // =====================  4 task =====================
    public static void fillDiagonal() {
        int[][] arr = new int[10][10];

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[0].length; j++) {
                if (i==j) arr[i] [j] = 1;
                System.out.print( arr [i] [j]);
            }
            System.out.println();
        }
    }

    // ===================== 5 task =====================
    public static void maxMinInArray() {
        int[] arr = {-78, 5, 3, 2, 145, 4, 5, 2, 4, 8};
        int max , min;
        max = min = arr[0];
        for (int i: arr) {
            if (max < i ) max = i;
            if (min > i ) min = i;
        }
        System.out.println("MAx = " + max + "; Min = " + min);
    }

    // ===================== 6 task =====================
    public static boolean isSumLeftAndRightIsEqual(int [] arr) {

        boolean triger = false;
        for (int i=0; i< arr.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
                    ;
            for (int l=0; l <= i; l++){
                sumLeft += arr[l];
            }
            for (int r=arr.length-1; r> i; r--){
                sumRight += arr[r];
            }
            if (sumLeft==sumRight) {triger=true; break;}
        }
        return triger;
    }

    // ===================== 7 task =====================
    public static int[] shiftArrayToLeftOrRight(int[] arr, int n) {
        // параметр n положительный смещает масив на n элементов вправо
        // параметр n отрицательный смещает масив на n элементов влево

        int buffer;

        if (n >= 0) {
            // параметр n положительный смещает масив на n элементов вправо
            for (int j = 1; j <= n; j++) {
                for (int i = 0; i < arr.length; i++) {
                    buffer = arr[i];
                    arr[i] = arr[arr.length - 1];
                    arr[arr.length - 1] = buffer;
                }
            };
            return arr;
        } else {
            // параметр n отрицательный смещает масив на n элементов влево
            for (int j = 1; j <= Math.abs(n); j++) {
                for (int i = arr.length - 1; i >= 0; i--) {
                    buffer = arr[i];
                    arr[i] = arr[0];
                    arr[0] = buffer;
                }
            };
            return arr;
        }
    }
}

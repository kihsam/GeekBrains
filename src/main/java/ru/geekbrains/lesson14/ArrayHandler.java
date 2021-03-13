package ru.geekbrains.lesson14;

public class ArrayHandler {

    public int[] getArrayAfterLast4(int[] a){
        for (int i = a.length-1; i>=0; i--) {
            if (a[i] == 4 ) {
                return getSliceArray(i + 1,a);
            }
        }
        throw new RuntimeException();
    }

    public int[] getSliceArray (int index, int[] sourceArray){
        int [] resultArray = new int [sourceArray.length - index];
        for (int i = index, j = 0;  i < sourceArray.length; i++,j++) {
            resultArray[j] = sourceArray[i];
        }
        return resultArray;
    }


    public boolean find4or1NumberinArr(int [] array) {
        boolean countFour,countOne;
        countFour = countOne = false;
        for (int ex:array) {
            if (ex == 4) {
                countFour = true;
            } else if ( ex == 1 ){
                countOne = true;
            } else {
                return false;
            }
        }
        return countFour && countOne;
    }
}

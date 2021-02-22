package ru.geekbrains.lesson9;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException {
        String[][] arrString = {{"1", "1", "7", "3"},
                {"1", "2", "4", "4"},
                {"5", "6", "7", "4"},
                {"3", "3", "4", "4"}};

        MyArraySize(arrString);

    }


    private static void MyArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (array.length != 4
                || array[0].length != 4
                || array[1].length != 4
                || array[2].length != 4
                || array[3].length != 4) {
            throw new MyArraySizeException("Ошибка. Размерность масива НЕ 4х4 !!!");

        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        summ += Integer.parseInt(array[i][j]);

                    } catch (Exception e) {
                        throw new MyArrayDataException("!!! Ошибка !!! \n неверные данные находятся в координате массива: строка = " + i + ", столбец " + j);
                    }

                }
            }
            System.out.println("сумма всех элементов масива = " + summ);
        }
    }

}

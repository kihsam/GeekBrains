package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Integer [] ar = {1,2,3,4,5,6};
        System.out.println(arrayToList( ar ));

        changeArrayElements(ar, 4,5);
        System.out.println(arrayToList( ar ));


        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<> (new Orange(),new Orange(), new Orange());
        Box<Apple> appleBox1 = new Box<>();

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.transferToOtherBox(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        appleBox.addFruit(new  Apple ( ) );
        System.out.println(appleBox.getWeight());









    }

    public static <T> List<T> arrayToList( T[] array){
        return Arrays.asList(array);
    }

    public static <T>  void  changeArrayElements( T[] arr, int element1, int element2 ) {
        T elementBuffer = arr[element2];
        arr[element2] = arr[element1];
        arr[element1] = elementBuffer;
    }
}

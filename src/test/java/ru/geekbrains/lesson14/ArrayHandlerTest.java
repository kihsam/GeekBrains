package ru.geekbrains.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHandlerTest {

    private final  ArrayHandler arrayHandler = new ArrayHandler();

    @ParameterizedTest
    @MethodSource("dataGetArrayAfterLast4")

    void getArrayAfterLast4(int[] originalArray, int[] expectrdResultArray) {
        int[] actualResultArray = arrayHandler.getArrayAfterLast4(originalArray);

        Assertions.assertArrayEquals(expectrdResultArray, actualResultArray);
    }

    private static Stream<Arguments> dataGetArrayAfterLast4 (){
        List <Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[] {1,2,3,4,5}, new int[]{5}));
        arguments.add(Arguments.arguments(new int[] {1,2,3,4}, new int[]{ }));
        arguments.add(Arguments.arguments(new int[] {4,1,2,4,3,4,5}, new int[]{5}));
        arguments.add(Arguments.arguments(new int[] {4,1,2,3,5}, new int[]{1,2,3,5}));
        return arguments.stream();
    }

    @ParameterizedTest
    @MethodSource("dataFind4or1NumberinArr")

    void find4or1NumberinArr(int[] array, boolean extendedRusult) {
        boolean actualResult = arrayHandler.find4or1NumberinArr(array);

        Assertions.assertEquals (extendedRusult, actualResult);
    }

    private static Stream<Arguments> dataFind4or1NumberinArr (){
        List <Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[] {1,1,1,4,4,1,4,4}, true));
        arguments.add(Arguments.arguments(new int[] {1,1,1,1,1,1}, false));
        arguments.add(Arguments.arguments(new int[] {4,4,4,4}, false));
        arguments.add(Arguments.arguments(new int[] {1,4,4,1,1,4,3}, false));
        return arguments.stream();
    }

}
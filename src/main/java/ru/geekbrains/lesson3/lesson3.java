package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static final int Max_NUMBER = 10;
    public static final int ATTEMPT_COUNTS = 3;
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String repeatGame;
    do {
        int compNumber = random.nextInt(Max_NUMBER);

        for (int i = 1; i <= ATTEMPT_COUNTS ; i++) {
            int answer = getNumberFromScanner("Введите число в пределах от 0 до 9: ", 0, 9);

            if (answer > compNumber) {
                System.out.println("Загаданое число меньше!");
                System.out.println("Осталость " + (ATTEMPT_COUNTS -i) + " попыток");
            } else if (answer < compNumber) {
                System.out.println("Загаданое число больше!");
                System.out.println("Осталость " + (ATTEMPT_COUNTS -i) + " попыток");
            } else {
                System.out.println(" Число угадано !");
                break;
            }
            if (i==ATTEMPT_COUNTS){
                System.out.println(" Увы, вы проиграли.");
            }
            
        }
        System.out.print("Повторить игру еще раз? 1 – да / 0 – нет : ");
        repeatGame = sc.next();

    } while (repeatGame.equals("да") || repeatGame.equals("1"));
    sc.close();

    }

    public static int getNumberFromScanner(String message, int min, int max) {

        int x;
        do {
            System.out.print(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;

    }

}

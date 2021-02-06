package ru.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {

        public static int SIZE = 5;
        public static int DOTS_TO_WIN = 4;

        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';

        public static char[][] map;

        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static boolean checkWin(char symb) {
            int lastIndex = map.length - 1;

            int mainDiagonal = 0;
            int sideDiagonal = 0;
            for (int i = 0; i < map.length; i++) {

                int rowCount = 0;
                int columnCount = 0;

                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] == symb && ++rowCount == DOTS_TO_WIN
                            || map[j][i] == symb && ++columnCount == DOTS_TO_WIN) {

                        return true;
                    }
                }

                if (map[i][i] == symb && ++mainDiagonal == DOTS_TO_WIN
                        || map[i][lastIndex - i] == symb && ++sideDiagonal == DOTS_TO_WIN) {

                    return true;
                }
            }

            return false;
        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            int[] blockingXY = getBlockingXY();
            System.out.println(Arrays.toString(blockingXY));
            if (blockingXY.length == 2) {
                y = blockingXY[0];
                x = blockingXY[1];
            } else {
                do {
                    y = rand.nextInt(SIZE);
                    x = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));
            }

            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static int[] getBlockingXY() {
            char symb = DOT_X;

            int mainDiagonal = 0;
            int sideDiagonal = 0;
            int lastIndex = map.length - 1;
            for (int i = 0; i < map.length; i++) {

                int rowCount = 0;
                int columnCount = 0;

                for (int j = 0; j < map.length; j++) {

                    if (map[i][j] == symb && (++rowCount + 1) == DOTS_TO_WIN) {

                        for (int l = 0; l < map.length; l++) {
                            if (isCellValid(l, i)) {
                                return new int[] { i, l };
                            }
                        }

                    }

                    if (map[j][i] == symb && (++columnCount + 1) == DOTS_TO_WIN) {

                        for (int l = 0; l < map.length; l++) {
                            if (isCellValid(i, l)) {
                                return new int[] { l, i };
                            }
                        }

                    }
                }

                if (map[i][i] == symb && (++mainDiagonal + 1) == DOTS_TO_WIN) {
                    for (int l = 0; l < map.length; l++) {
                        if (isCellValid(l,l)) {
                            return new int[] { l, l };
                        }
                    }
                }

                if (map[i][lastIndex - i] == symb && (++sideDiagonal + 1) == DOTS_TO_WIN) {
                    for (int l = 0; l < map.length; l++) {
                        if (isCellValid(lastIndex - l, l)) {
                            return new int[] { l, lastIndex - l };
                        }
                    }
                }
            }

            return new int[0];
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                y = sc.nextInt() - 1;
                x = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            return map[y][x] == DOT_EMPTY;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (char[] chars : map) {
                System.out.println(Arrays.toString(chars));
            }
        }



}

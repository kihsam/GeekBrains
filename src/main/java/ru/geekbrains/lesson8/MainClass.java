package ru.geekbrains.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Player man = new Man("Kost`ya", 500, 4);
        Player man2 = new Man("Dmitriy", 1000,3);
        Player cat = new Cat( "Murzik", 150 , 1 );
        Player cat2 = new Cat("Pushok", 170, 2 );
        Player robot = new Robot("RD1", 700, 1 );
        Player robot2 = new Robot("RD2", 700, 4 );

        ArrayList<Player> players = new ArrayList<>();
        players.add(man);
        players.add(man2);
        players.add(cat);
        players.add(cat2);
        players.add(robot);
        players.add(robot2);


        Hurdles treadmill = new Treadmill("Дорожка1",70);
        Hurdles wall = new Wall("Стена1", 3);
        Hurdles treadmill2 = new Treadmill("Дорожка2",160);
        Hurdles wall2 = new Wall("Стена2", 2);

        Hurdles [] hurdles = {treadmill ,  treadmill2, wall, wall2};

        System.out.println("=================================================");

        for (int i = 0; i < hurdles.length; i++) {
            for (int j = 0; j < players.size(); j++) {

                if (!players.get(j).jump(hurdles[i]) | !players.get(j).run(hurdles[i])) {
                    System.out.println("       !!!удалаем участника !!!  " + players.get(j).getName());

                   players.remove(j);
                   j--;

                }
           }
        }
        System.out.println();
        System.out.println("Все препятствия преодолели " + players.size() + " участника(ов):");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getName());
        }

    }
}

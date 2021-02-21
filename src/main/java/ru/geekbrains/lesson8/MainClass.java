package ru.geekbrains.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Player man = new Man("Kost`ya", 50, 1);
        Player man2 = new Man("Dmitriy", 1000,4);
        Player cat = new Cat( "Murzik", 50 , 3 );
        Player cat2 = new Cat("Pushok", 70, 10 );
        Player robot = new Robot("RD1", 700, 10 );
        Player robot2 = new Robot("RD2", 700, 10 );

        ArrayList<Player> players = new ArrayList<>();
        players.add(man);
        players.add(man2);
        players.add(cat);
        players.add(cat2);
        players.add(robot);
        players.add(robot2);

        // Player [] players = {man,man2,cat,cat2};

        Hurdles treadmill = new Treadmill("Дорожка1",70);
        Hurdles wall = new Wall("Стена1", 2);
        Hurdles treadmill2 = new Treadmill("Дорожка2",100);
        Hurdles wall2 = new Wall("Стена2", 1);

        Hurdles [] hurdles = {treadmill ,  treadmill2, wall, wall2};
        //Object [] players = { cat, cat2};
        System.out.println("=================================================");

        for (int i = 0; i < hurdles.length; i++) {
            for (int j = 0; j < players.size(); j++) {
               // players[j].jump(hurdles[i]);
                //players[j].run(hurdles[i]);

                if (!players.get(j).jump(hurdles[i]) | !players.get(j).run(hurdles[i])) {

                   players.remove(j);

                }
           }


        }

            



        
        //cat2.run(wall); cat2.run(treadmill); cat2.jump(wall); cat2.jump(treadmill);
        //cat.run(wall); cat.run(treadmill); cat.jump(wall); cat.jump(treadmill);






//        cat.jump(wall.getWallHeight());
//        cat.run(treadmill.getTreadmillLong());
//        man.jump(wall.getWallHeight());
//        man.run(treadmill.getTreadmillLong());
//        robot.jump(wall.getWallHeight());
//        robot.run(treadmill.getTreadmillLong());




    }
}

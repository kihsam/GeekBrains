package ru.geekbrains.lesson8;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat( "Murzik", 50 , 1 );
        Man man = new Man("Petr", 2000, 3);
        Robot robot = new Robot("EVM", 3000, 0 );
        Treadmill treadmill = new Treadmill(50);
        Wall wall = new Wall(2);






        cat.jump(wall.getWallHeight());
        cat.run(treadmill.getTreadmillLong());
        man.jump(wall.getWallHeight());
        man.run(treadmill.getTreadmillLong());
        robot.jump(wall.getWallHeight());
        robot.run(treadmill.getTreadmillLong());




    }
}

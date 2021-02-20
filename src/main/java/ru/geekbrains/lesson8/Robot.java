package ru.geekbrains.lesson8;

public class Robot implements Run,Jump{ private String name; private int thisRun; private int thisJump;
    public Robot(String name, int thisRun, int thisJump) {
        this.name = name;
        this.thisRun = thisRun;
        this.thisJump = thisJump;
    }


    @Override
    public void run (int run){
        if (run <= thisRun) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " не смог пробежать");
        }

    }

    @Override
    public  void jump (int jump){
        if (jump <= thisJump) {
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " не смог перепрыгнуть");
        }
    }
}

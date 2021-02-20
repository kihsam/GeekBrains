package ru.geekbrains.lesson8;

public class Man implements Run,Jump{ private String name; private int thisRun; private int thisJump;
    public Man(String name, int thisRun, int thisJump) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThisRun() {
        return thisRun;
    }

    public void setThisRun(int thisRun) {
        if (thisRun >= 0) {
            this.thisRun = thisRun;
        }else {
            this.thisRun = 0;
        }
    }

    public int getThisJump() {
        return thisJump;
    }

    public void setThisJump(int thisJump) {
        if (thisJump >= 0) {
            this.thisJump = thisJump;
        }else {
            this.thisJump = 0;
        }
    }
}

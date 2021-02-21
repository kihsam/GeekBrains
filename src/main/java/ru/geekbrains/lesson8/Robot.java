package ru.geekbrains.lesson8;

public class Robot implements Run, Jump, Player {
    private String name;
    private int thisRun;
    private int thisJump;

    public Robot(String name, int thisRun, int thisJump) {
        this.name = name;
        this.thisRun = thisRun;
        this.thisJump = thisJump;
    }


    @Override
    public boolean run(Hurdles hurdles) {
        final String nameHurglesClass = "Treadmill";

        if (hurdles.getClass().getSimpleName().equals(nameHurglesClass)) {
            if (hurdles.getParam() <= thisRun) {
                System.out.println(name + " успешно пробежал " + hurdles.getParam() + " м по " + hurdles.getNameHurdles());
                return true;
            } else {
                System.out.println(name + " не смог пробежать " + hurdles.getParam() + " м по " + hurdles.getNameHurdles());
                return false;
            }
        } else {
            // System.out.println(name + " еще не умет бегать по " + hurdles.getNameHurdles());
            return true;
        }


    }


    @Override
    public boolean jump(Hurdles hurdles) {
        final String nameHurglesClass = "Wall";

        if (hurdles.getClass().getSimpleName().equals(nameHurglesClass)) {
            if (hurdles.getParam() <= thisJump) {
                System.out.println(name + " успешно перепрыгнул " + hurdles.getParam() + " м через " + hurdles.getNameHurdles());
                return true;
            } else {
                System.out.println(name + " не смог перепрыгнуть " + hurdles.getParam() + " м через " + hurdles.getNameHurdles());
                return false;
            }
        } else {
            // System.out.println(name + " еще не умет бегать по " + hurdles.getNameHurdles());
            return true;
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
        } else {
            this.thisRun = 0;
        }
    }

    public int getThisJump() {
        return thisJump;
    }

    public void setThisJump(int thisJump) {
        if (thisJump >= 0) {
            this.thisJump = thisJump;
        } else {
            this.thisJump = 0;
        }
    }
}

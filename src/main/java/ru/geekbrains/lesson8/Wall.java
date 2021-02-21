package ru.geekbrains.lesson8;

public class Wall implements Hurdles { private String name; private int wallHeight;
    public Wall( String name, int wallHeight) {
        this.name = name;
        this.wallHeight = wallHeight;
    }

    @Override
    public void setParam(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public int getParam (){
        return wallHeight;
    }
    @Override
    public String getNameHurdles() {
        return name;
    }

    @Override
    public void setNameHurdles(String name) {
        this.name = name;
    }
}

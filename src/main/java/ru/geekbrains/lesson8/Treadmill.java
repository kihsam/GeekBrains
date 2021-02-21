package ru.geekbrains.lesson8;

public class Treadmill implements Hurdles {String name;  private int treadmillLength;
    public Treadmill( String name, int treadmillLength){
        this.name = name;
        this.treadmillLength = treadmillLength;
    }
    @Override
    public int getParam() {
        return treadmillLength;
    }
    @Override
    public void setParam(int treadmillLength) {
        this.treadmillLength = treadmillLength;
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

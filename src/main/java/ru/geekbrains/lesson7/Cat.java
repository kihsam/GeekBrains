package ru.geekbrains.lesson7;

public class Cat {private String name; private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public boolean satiety;

    public void eat(Plate p) {
        if (p.food >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            p.decreaseFood(0);
        }
    }

    public String getName() {
        return name;
    }
}

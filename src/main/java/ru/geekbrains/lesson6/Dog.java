package ru.geekbrains.lesson6;

public class Dog  extends Animal {
    public Dog (String name){
        super(name);
    }

    @Override
    public void run(int distance) {
        int maxRunDog = 500;
        if (distance < maxRunDog){
            System.out.println("Собака " + name + " пробежала: " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " пробежала всего 500 метров");
        }

    }
    @Override
    public void sail (int distance) {
        int maxSailDog = 10;
        if (distance < maxSailDog){
            System.out.println("Собака " + name + " проплыла: " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " проплыла всего 10 метров");
        }

    }
}

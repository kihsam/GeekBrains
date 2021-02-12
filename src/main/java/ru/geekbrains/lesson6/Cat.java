package ru.geekbrains.lesson6;

public class Cat extends Animal {
        public Cat(String name){
            super(name);

        }
        @Override
        public void run(int distance) {
            int maxRunCat = 200;
            if (distance < maxRunCat){
                System.out.println("Кот " + name + " пробежал: " + distance + " метров");
            } else {
                System.out.println("Кот " + name + " пробежал всего 200 метров");
            }

        }
    @Override
    public void sail (int distance) {
        int maxSailCat = 0;
        if (distance == maxSailCat){
            System.out.println("Кот " + name + " проплыл: " + distance + " метров");
        } else {
            System.out.println("Кот " + name + " не умет плавать");
        }

    }
}



package ru.geekbrains.lesson6;

public class AnimalsApp {

        public static void main(String[] args) {
            Animal animal = new Animal("Пантера");
            Cat cat = new Cat("Мурзик");
            Cat cat2 = new Cat("Васька");
            Dog dog = new Dog("Шарик");
            Dog dog2 = new Dog("Барбос");
            Cat cat3 = new Cat("Пушок");
            animal.run(400); animal.sail(500);
            cat.run(290); cat.sail(200);
            cat2.run(150);cat2.sail(0);
            dog.run(400);dog.sail(8);
            dog2.run(600);dog2.sail(20);
            cat3.run(50);cat3.sail(20);
            System.out.println("Всего было создано: " + Animal.countAnimals + " животных");
        }

}

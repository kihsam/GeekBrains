package ru.geekbrains.lesson7;

public class MainClass {
    public static void main(String[] args) {
        //Cat cat = new Cat("Barsik", 65);
        Plate plate = new Plate(50);

        Cat [] catArray = new Cat[5];
        catArray[0] = new Cat("Barsik", 5);
        catArray[1] = new Cat("Pushok", 10);
        catArray[2] = new Cat("Murzik", 8);
        catArray[3] = new Cat("Markiz", 15);
        catArray[4] = new Cat("Pufik", 15);


        plate.info();

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            String satiet;
            if (catArray[i].satiety == true){
                satiet = "поел";
            } else {
                satiet = "голоден";
            }
            System.out.println("кот по имени " + catArray[i].getName() + " " + satiet);
        }

        plate.info();

    }

}

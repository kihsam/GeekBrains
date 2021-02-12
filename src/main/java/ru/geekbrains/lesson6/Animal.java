package ru.geekbrains.lesson6;


    public class Animal {
        static int countAnimals;
        protected String name;

        public Animal(String name){
            setName(name);
            countAnimals++;
        }

        void run(int distance) {
            System.out.println("Животное по кличке " + name + " пробежало " + distance + " метров");
        }
        void sail(int distance) {
            System.out.println("Животное по кличке " + name + " проплыло " + distance + " метров");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }








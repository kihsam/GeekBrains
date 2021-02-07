package ru.geekbrains.lesson5;

public class lesson5 {
    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 41);
        personArray[1] = new Person("Yo Kim", "Manager", "kim@gmail.com", 892456345, 40000, 45);
        personArray[2] = new Person("Korun la Drek", "Technician", "la.drek@seznam.cz", 892323456, 25000, 55);
        personArray[3] = new Person("Sephire Kurt", "Courier", "kutr@inbox.info", 892223123, 20000, 43);
        personArray[4] = new Person("Petrov Roman", "Guard", "roman@bbc.com", 892998876, 28000, 35);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].info();
            }
        }

    }

}




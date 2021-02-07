package ru.geekbrains.lesson5;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, int phone, int salary, int age) {
        setName(name);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }


    public void info() {
        System.out.println("         Информация о сотруднике    ");
        System.out.println("           ФИО сотрудника: " + getName());
        System.out.println("     Должность сотрудника: " + getPosition());
        System.out.println("Номер телефона сотрудника: " + getPhone());
        System.out.println("      Зарплата сотрудника: " + getSalary());
        System.out.println("       Возраст сотрудника: " + getAge());
        System.out.println();

    }


    private static boolean contains(String pattern, String content) {
        return content.matches(pattern);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (contains("([A-Za-z ]{2,}[\\ ]?[A-Za-z ]{2,})+", name)) {
            this.name = name;
        } else {
            System.out.println("В ФИО содержатся недопустимые символы! =>" + name );
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (contains("([A-Za-zА-Яа-я]{2,}[\\ ]?[A-Za-zА-Яа-я]{2,})+", position)) {
            this.position = position;
        } else {
            System.out.println("В позиции содержатся недопустимые символы! => " + position);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (contains("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}", email)) {
            this.email = email;
        } else {
            System.out.println("Не верный формат e-mail =>" + email);
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {

        if (contains("\\d*", Integer.toString(phone)) && phone>0) {
            this.phone = phone;
        } else {
            System.out.println("Номер телефона содержит недопустимые символы! =>" + phone);
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary>0) {
        this.salary = salary;
        } else {
            System.out.println("зарплата не может быть меньше 0! =>" + salary);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age >= 16 & age < 100 ) {
            this.age = age;
        } else {
            System.out.println("Недопустимый возраст! =>" + age);
        }

    }
}

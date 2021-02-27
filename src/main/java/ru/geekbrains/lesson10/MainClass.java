package ru.geekbrains.lesson10;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("man");
        list.add("cat");
        list.add("top");
        list.add("str");
        list.add("fix");
        list.add("web");
        list.add("dot");
        list.add("dot");
        list.add("dot");
        list.add("jre");
        list.add("rtt");
        list.add("aaa");
        list.add("eee");
        list.add("ttt");
        list.add("ttt");
        list.add("man");

        System.out.println("Входящий список: ");
        System.out.println(list);       // list.forEach(System.out::println);

        System.out.println("список уникальных слов:");
        Map<String, Integer> countWords = new HashMap<>();
        for (String s : list) {
            countWords.put(s, countWords.getOrDefault(s, 0) + 1);
        }
        System.out.println(countWords.entrySet());    //countWords.entrySet().forEach(System.out::println);


        System.out.println();
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Sidorov", "+420776724000");
        phoneBook.add("Krasnov", "+420776723001");
        phoneBook.add("Yuzvak", "+420776723003");
        phoneBook.add("Yuzvak", "+420776723005");
        phoneBook.add("Yuzvak", "+420776723015");
        phoneBook.add("Sidorov", "+420776724010");



        String name = "Sidorov";
        System.out.println(" Номер телефона у " + name + ": " + phoneBook.get(name));
        name = "Yuzvak";
        System.out.println(" Номер телефона у " + name + ": " + phoneBook.get(name));
    }
}

package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> nuberPhoneList = phoneBook.get(name);

//        System.out.println(phoneBook.get(name));
//        System.out.println(nuberPhoneList);

        if (nuberPhoneList == null) nuberPhoneList = new ArrayList<>();
        nuberPhoneList.add(tel);
        phoneBook.put(name, nuberPhoneList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
}

package ru.geekbrains.lesson11;

import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit & RealFruit>{

    private final List<T> fruitBox;

    public Box (T ...fruits){
        this.fruitBox = Arrays.asList(fruits);
    }

    public float getWeight(){

        float totalWeight = 0.0f;

        for (T fruit: fruitBox) {
            totalWeight += fruit.getWeight();
            
        }
        return totalWeight;
    }

    public boolean compare (Box<?> otherBox){
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.001;
    }

    public void transferToOtherBox(Box<T> otherBox){
        if (otherBox == this) return;
        otherBox.fruitBox.addAll(this.fruitBox);
        fruitBox.clear();

    }

    public void addFruit (T fruit){
        fruitBox.add(fruit);
    }
}

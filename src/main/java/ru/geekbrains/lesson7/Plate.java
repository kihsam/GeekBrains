package ru.geekbrains.lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
         this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
   }
   public void  addingFoodPlate (int addFood){
        if (addFood>0){
            food += addFood;
        }
   }

}

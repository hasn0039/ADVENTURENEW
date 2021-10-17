package com.company;

public class Food extends Item {
    private int foodhp;

    public boolean getIsEaten() {
        return isEaten;
    }

    public void setEaten(boolean isEaten) {
        this.isEaten = isEaten;
    }

    private boolean isEaten;





    public Food(String name, int foodhp) {
        super(name);
        this.foodhp = foodhp;
        this.isEaten = isEaten;
    }


    public int getFoodhp() {
        return foodhp;
    }

    public void setFoodhp(int foodhp) {
        this.foodhp = foodhp;
    }

    



}









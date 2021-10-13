package com.company;

public class Food extends Item {
    private int foodhp;




    public Food(String name, int foodhp) {
        super(name);
        this.foodhp = foodhp;
    }


    public int getFoodhp() {
        return foodhp;
    }

    public void setFoodhp(int foodhp) {
        this.foodhp = foodhp;
    }

    

    public void eatFood(){

    }

}









package com.company;

public class Player {

    private int health = 100;


    public Player() {

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

public String changeHealth (int healthChangeValue){
        health = health+healthChangeValue;
        return "you have trigged a trap and arrows are coming from every direction "+healthChangeValue+".";

}

public String consumedFood (int healthUp){
        health = health+healthUp;
        return "u have consumed the apple of eden your health have increased by"+healthUp+"points";
}






}

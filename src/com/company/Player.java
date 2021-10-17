package com.company;

import java.util.ArrayList;

public class Player {

    private int health = 100;
    private ArrayList<Item> inventory;

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }


    public Player(int health, ArrayList<Item> inventory) {
        this.health = health;
        this.inventory = inventory;

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

public String changeHealth (int healthChangeValue){
        health = health+healthChangeValue;
        if (health <= 0) {
        System.out.println("your health has dropped to 0 u are dead");
        System.exit(0);}
        return "you have trigged a trap and arrows are coming from every direction "+healthChangeValue+".";

}

public String consumedFood (int healthUp){
        health = health+healthUp;
        return "u have consumed the apple of eden your health have increased by"+healthUp+"points";
}
    public void eatFood(Player player, Food food){
        if (food.getIsEaten()==false){
            player.setHealth(player.getHealth() + food.getFoodhp() );
            food.setEaten(true);
        }

        else {
            System.out.println("The food is already eaten");
        }
    }







}

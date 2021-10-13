package com.company;

import java.util.ArrayList;

public class Room {
//fields
    private String name;
    private String item;
    private boolean currentRoom;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    public ArrayList<Item> itemList = new ArrayList<>();
    public String describtion;
    private String look;


    public Room(String name, boolean currentRoom, String item){ // Constructor - En constructor er en cunstructor når den har det samme navn som en klasse
        this.name = name;
        this.currentRoom = currentRoom;
        this.itemList = itemList;
        this.look = look;
        this.item = item;



    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCurrentRoom(boolean currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setDirections(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }

    public boolean isCurrentRoom() {
        return currentRoom;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public void look() {
        System.out.println("You are currently in " + name);

        System.out.println(this.item);
    }
    public void addItem(Item item){
        itemList.add(item);
    }


}

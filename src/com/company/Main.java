package com.company;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Player player = new Player(100, new ArrayList<>());
    ArrayList<Item> inventory = new ArrayList();
    Item sword = new Item("sword");
    Item apple_of_eden = new Food("apple of eden", 20, false);
    Item key = new Item("key");
    Item eggplant = new Food("eggplant", 10, false);


    Room room1 = new Room("Room 1", true, "start room", new ArrayList<Item>());
    Room room2 = new Room("Room 2", false, "there is a yellow penguin in the room and a in the corner", new ArrayList<Item>());
    Room room3 = new Room("Room 3", false, "A message written in blood on the walls", new ArrayList<Item>());
    Room room4 = new Room("Room 4", false, "A pentagram drawn in chalk or blood with a half melted candles at the points of the star", new ArrayList<Item>());
    Room room5 = new Room("Room 5", false, "A violin, playing itself", new ArrayList<Item>());
    Room room6 = new Room("Room 6", false, "A child’s bedroom with the bed meticulously made and dark stains leading to under the bed", new ArrayList<Item>());
    Room room7 = new Room("Room 7", false, "A room that has torches in sconces lining the walls. In the center of the room " +
            "is a key and a single candle that sheds darkness instead of light", new ArrayList<Item>());
    Room room8 = new Room("Room 8", false, "A diary of someone. It starts out fairly normal, but slowly descends into madness", new ArrayList<Item>());
    Room room9 = new Room("Room 9", false, "There is a eggplant on the floor ", new ArrayList<Item>());


    public void run() {


        ArrayList<Item> inventory = new ArrayList<>();
        Room[] rooms = new Room[9];

        int currentRoom = 0;
        room2.addItem(sword);
        room3.addItem(apple_of_eden);
        room7.addItem(key);
        room9.addItem(eggplant);


        System.out.println("__//WELCOME TO THE LITTLE ADVENTURE 3.0\\\\__");




        room1.setDirections(null, room4, room2, null);
        room2.setDirections(null, null, room3, room1);
        room3.setDirections(null, room6, null, room2);
        room4.setDirections(room1, room7, null, null);
        room5.setDirections(null, room8, null, null);
        room6.setDirections(room3, room9, null, null);
        room7.setDirections(room4, null, room8, null);
        room8.setDirections(room5, null, room9, room7);
        room9.setDirections(room6, null, null, room8);


        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[5] = room6;
        rooms[6] = room7;
        rooms[7] = room8;
        rooms[8] = room9;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Where do you want to go?: ");
            String inputA = input.nextLine();



            switch (inputA) {
                case "go n":
                case "go north":

                    for (int i = 0; i < rooms.length; i++)

                        if (rooms[i].isCurrentRoom()) {
                            if (rooms[i].getNorth() == null) {
                                System.out.println("You can't go in that direction");
                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getNorth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getNorth().getName());
                                System.out.println(rooms[i]);
                                if (rooms[i].getName() == "room1") {
                                    inventory.add(sword);
                                    System.out.println("you picked up a sword");
                                } else if (rooms[i].getName() == "room2") {
                                    inventory.add(apple_of_eden);
                                    System.out.println("you picked up apple of eden");
                                }
                                if (rooms[i].getName() == "room7") {
                                    inventory.add(key);
                                    System.out.println("you picked up key");
                                }
                                if (rooms[i].getName() == "room9") {
                                    inventory.add(eggplant);
                                    System.out.println("you picked up eggplant");
                                }
                                //System.out.println("U can pick up the following item:" +rooms[i].getItemList());

                                System.out.println("U can pick up the following item:");
                                for (int j = 0; j < rooms[i].getItemList().size(); j++) {
                                    System.out.println(rooms[i].getItemList().get(j) + "");
                                }
                                if (rooms[i].getName() == "room1") {
                                    inventory.add(sword);
                                    System.out.println("you picked up a sword");
                                } else if (rooms[i].getName() == "room2") {
                                    inventory.add(apple_of_eden);
                                    System.out.println("you picked up apple of eden");
                                }
                                if (rooms[i].getName() == "room7") {
                                    inventory.add(key);
                                    System.out.println("you picked up key");
                                }
                                if (rooms[i].getName() == "room9") {
                                    inventory.add(eggplant);
                                    System.out.println("you picked up eggplant");
                                }


                            }
                            if (rooms[i] == room2) {
                                System.out.println(player.changeHealth(-50));
                            }


                            break;
                        }


                    break;
                case "go s":
                case "go south":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getSouth() == null) {
                                System.out.println("You can't go in that direction");
                            } else {

                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getSouth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getSouth().getName());
                                System.out.println("U can pick up the following item:" + rooms[i].getItemList());
                                System.out.println("Do u want to pick up this item? press yes or no");
                                String yesorno = input.nextLine();
                                if (yesorno.equals("yes")) {
                                    System.out.println("what do u want to pick up?");
                                    String whitch = input.nextLine();
                                    Item item;
                                    for (int z = 0; z < rooms[i].getItemList().size(); z++) {
                                        if (rooms[i].getItemList().get(z).getName().equals(whitch)) {
                                            item = rooms[i].getItemList().get(z);
                                            inventory.add(item);
                                            rooms[i].removeItem(item);
                                        }
                                    }
                                }

                            }
                            if (rooms[i] == room2) {
                                System.out.println(player.changeHealth(-50));
                            }

                            break;
                        }

                    }
                    break;
                case "go w":
                case "go west":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getWest() == null) {
                                System.out.println("You can't go in that direction");

                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getWest().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getWest().getName());
                                System.out.println("U can pick up the following item:" + rooms[i].getItemList());
                                System.out.println("Do u want to pick up this item? press yes or no");
                                String yesorno = input.nextLine();
                                if (yesorno.equals("yes")) {
                                    System.out.println("what do u want to pick up?");
                                    String whitch = input.nextLine();
                                    Item item;
                                    for (int z = 0; z < rooms[i].getItemList().size(); z++) {
                                        if (rooms[i].getItemList().get(z).getName().equals(whitch)) {
                                            item = rooms[i].getItemList().get(z);
                                            inventory.add(item);
                                            rooms[i].removeItem(item);
                                        }
                                    }
                                }
                                break;
                            }
                            if (rooms[i] == room2) {
                                System.out.println(player.changeHealth(-50));
                            }
                            break;
                        }

                    }
                    break;
                case "go e":
                case "go east":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getEast() == null) {
                                System.out.println("You can't go in that direction");
                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getEast().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getEast().getName());
                                System.out.println("U can pick up the following item:" + rooms[i].getItemList());
                                System.out.println("Do u want to pick up this item? press yes or no");
                                String yesorno = input.nextLine();
                                if (yesorno.equals("yes")) {
                                    System.out.println("what do u want to pick up?");
                                    String whitch = input.nextLine();
                                    Item item;
                                    for (int z = 0; z < rooms[i].getItemList().size(); z++) {
                                        if (rooms[i].getItemList().get(z).getName().equals(whitch)) {
                                            item = rooms[i].getItemList().get(z);
                                            inventory.add(item);
                                            rooms[i].removeItem(item);
                                        }
                                    }
                                }

                            }
                            if (rooms[i] == room2) {
                                System.out.println(player.changeHealth(-50));
                            }
                            break;
                        }
                    }
                    break;
            }

            switch (inputA) {

                case "check hp":
                    player.getHealth();
                    if (player.getHealth() <= 100 && player.getHealth() > 50) {
                        System.out.println("you have " + player.getHealth() + " health, go out and fight");
                    } else if (player.getHealth() <= 50 && player.getHealth() > 0) {
                        System.out.println("you have " + player.getHealth() + " health, u shouldn't fight");
                    } else if (player.getHealth() <= 0) {
                        System.out.println("your health has dropped to 0 u are dead");
                        System.exit(0);
                    }



                    break;


                case "check inven":
                    System.out.println(inventory);

                    break;
                case "pickup":
                    System.out.println("What do you do want pick up?");
                    String item = input.nextLine();
                    //pickUp(inventory, item);

                    break;
                case "drop":
                    System.out.println("What do you want to drop?");
                    String drop = input.nextLine();
                    //dropitem(inventory, drop);

                    break;
                case "look":
                    System.out.println("You are now in " + rooms[currentRoom].getName());
                    System.out.println("lookin around: " + rooms[currentRoom].getItem());

                    break;
                case "help":
                    System.out.println("Commands:");
                    System.out.println("U can use one of the following commands to navigate around in the game -go east/go north/go south/go west-.");
                    System.out.println("Type -look- - Use the command to what is around you and see which items you are able to pick up");
                    System.out.println("Type -pickup- to pick up items in the rooms");
                    System.out.println("Type -drop- to drop items from your inventory");
                    System.out.println("Type -check hp- to see the players current health");
                    System.out.println("Type -check inven- to see what you are carrying");

                    System.out.println("Type -exit- - to quit the game.");

                    break;
                case "exit":
                    break;


            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }


    public static void pickUp(ArrayList<String> inventory, String item) {
        inventory.add(item);

    }

    public static void dropitem(ArrayList<String> inventory, String item) {
        inventory.remove(item);
    }




    public void takeDamage(int damage, Room room, Player player) {

    }


}
/*System.out.println("Do u want to pick up this item? press yes or no");
        String yesorno = input.nextLine();
        if(yesorno.equals("yes")){
        System.out.println("what do u want to pick up?");
        String whitch = input.nextLine();
        Item item;
        for (int z=0; z<rooms[i].getItemList().size();z++){
        if(rooms[i].getItemList().get(z).getName().equals(whitch)){
        item = rooms[i].getItemList().get(z);
        inventory.add(item);
        rooms[i].removeItem(item);
        }
        }
        }
        if(yesorno.equals("no")){
        continue;*/

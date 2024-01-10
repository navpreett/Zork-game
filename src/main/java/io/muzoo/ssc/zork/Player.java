package io.muzoo.ssc.zork;

import java.util.ArrayList;
public class Player extends Entity {
    private Room location;
    private Room moving;
    private ArrayList<Thing> inventory;
    private int numOfObjects;

    public Player(int x, int y) {
        super(x, y);
        location = null;
        moving = null;
        inventory = new ArrayList<Thing>();
        numOfObjects = 0;
    }

    private String name;

    public Player(String name, int x, int y) {
        this(x, y);
        this.name = name;
    }

    public void take(Thing item) {
        inventory.add(item);
    }

    public void drop(Thing item) {
        inventory.remove(item);
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;
    }

    public Room getMoving() {
        return moving;
    }

    public ArrayList<Thing> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Thing> inventory) {
        this.inventory = inventory;
    }

    public int getNumOfObjects() {
        return numOfObjects;
    }

    public void setNumOfObjects(int numOfObjects) {
        this.numOfObjects = numOfObjects;
    }

    public Room getmoving() {
        return moving;
    }

    public void setMoving(Room moving) {
        this.moving = moving;
    }


    @Override
    public void tick() {
    }

    public void equip(Equipable item) {
        //set item to player
    }

    public void viewPlayerInventory() {
        System.out.println("Player's inventory");
        System.out.println();
        if (inventory.size() == 0)
            System.out.println("There is no inventory");
        else {
            for (int i = 0;
                 i < inventory.size();
                 i++)
                System.out.println(i + " " + inventory.get(i));
        }
        System.out.println();
    }

    public Thing getInventory(int takingThings) {
        Thing things = inventory.get(takingThings);
        drop(things);
        return things;
    }

}
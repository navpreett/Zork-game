package io.muzoo.ssc.zork;
import java.util.ArrayList;
public class Room {
    private int x, y, width, height, doors[];
    private String name, description;
    private ArrayList<Thing> contents;
    private int numOfThings;

    public Room() {
        contents = new ArrayList<>();
        setType("Room");
    }

    private void setType(String room) {
    }

    public static final Room dungeon = new Room("The Dungeon", "Here lie many monsters that have lived for centuries and terrorized many villages. Your goal is to defeat them.", 128, 128, 256, 256, new int[]{128, 128, 128, 128});//lengths calculated from element

    public Room(String name, String description, int x, int y, int weight, int height, int[] doors) {
        if (doors.length != 4)
            throw new IllegalArgumentException("Must be 4 doors");
        this.name = name;
        this.description = description;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.doors = doors;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }

    public int[] getDoors() {
        return doors;
    }

    public ArrayList<Thing> getContents() {
        return contents;
    }

    public void addObject(Thing item) {
        contents.add(item);
    }

    public void drop(Thing item) {
        contents.remove(item);
    }

    public void setContents(ArrayList<Thing> contents) {
        this.contents = contents;
    }

    public int getNumOfThings() {
        numOfThings = contents.size();
        return numOfThings;
    }

    public String setLocation() {
        return "Room";
    }
    public void lookAtContent() {
        System.out.println("room contents");
        System.out.println();
        if (contents.size() == 0)
            System.out.println("There is no item in the room");
        else {
            for (int i = 0;
                 i < contents.size();
                 i++)
                System.out.println(i + " " + contents.get(i));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Room [name=" + name + ", desc=" + description + ", contents=" + contents
                + ", numberOfThings=" + getNumOfThings() + "]";
    }
    public Thing getItem(int takingThings){
        Thing things= contents.get(takingThings);
        drop(things);
        return things;
    }
}



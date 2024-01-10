package io.muzoo.ssc.zork;
import java.util.HashMap;
import java.util.Map;
public class Location {
    private String type;
    private HashMap<String, Location> roomDirection;

    public Location() {
        roomDirection = new HashMap<String, Location>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void DirectionsAdded(String direction, Location location) {
        roomDirection.put(direction, location);
    }

    public HashMap<String, Location> getRoomDirection() {
        return roomDirection;
    }

    public void setRoomDirection(HashMap<String, Location> roomDirection) {
        this.roomDirection = roomDirection;
    }

    @Override
    public String toString() {
        return "Location [type=" + type + ", roomDirections=" + roomDirection + "]";
    }
}


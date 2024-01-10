package io.muzoo.ssc.zork;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Map {
    public static Map setupMap(File file) {
        return new Map();
    }
    public void saveMap(File file){
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(asText());
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public String asText(){
        return "This is a map.";
    }
}

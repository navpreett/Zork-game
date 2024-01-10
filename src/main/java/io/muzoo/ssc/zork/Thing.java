package io.muzoo.ssc.zork;

public class Thing {
    private String name;
    private String description;

    public Thing() {

    }

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
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
    @Override
    public String toString(){
        return "Thing's name=" + name+ ", description="+ description;
    }
}

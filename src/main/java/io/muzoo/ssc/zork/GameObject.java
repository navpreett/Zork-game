package io.muzoo.ssc.zork;

public class GameObject {
    String name;
    Runnable effectEquip;
    Runnable effectDeEquip;
    public GameObject(String name, Runnable effectEquip, Runnable effectDeEquip){
        this.name=name;
        this.effectEquip=effectEquip;
        this.effectDeEquip=effectDeEquip;
    }
    public void equip(){effectEquip.run();}
    public void DeEquip(){effectDeEquip.run();}
}

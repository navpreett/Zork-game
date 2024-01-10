package io.muzoo.ssc.zork;
public abstract class Entity {
    //position
    private int hp;//health
    private int atk;//how much force is needed to attack
    private int def;//strength
    public Entity (int x, int y){
        this.hp=hp;
        this.atk=atk;
        this.def=def;
    }
    public int getHp(){
        return hp;
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }

    public abstract void tick();    //its where the entity will be updated and moved
    public void onHit(Entity source){
        hp -= (100-hp)*source.atk/100;
    }

}

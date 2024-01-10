package io.muzoo.ssc.zork;
public abstract class Monster extends Entity{
    private int hp;//health
    private int atk;//how much force is needed to attack
    private int def;//strength
    public Monster(int x, int y){
        super(x,y);
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

    public abstract void tick();
}

package models;

public class Enemy {

    private String id;
    private String name;
    private String description;
    private String dangerClass;

    private int hp;
    private int physDmg;
    private int magicDmg;
    private int physDefense;
    private int magicDefense;

    public Enemy(String id, String name, String description, String dangerClass,
                 int hp, int physDmg, int magicDmg, int physDefense, int magicDefense){
        this.id = id;
        this.name = name;
        this.description = description;
        this.dangerClass = dangerClass;
        this.hp = hp;
        this.physDmg = physDmg;
        this.magicDmg = magicDmg;
        this.physDefense = physDefense;
        this.magicDefense = magicDefense;
    }

    public String getId() {return id;}

    public String getName() {return name;}

    public String getDescription() {return description;}

    public String getDangerClass() {return dangerClass;}

    public int getHp() {return hp;}

    public int getPhysDmg() {return physDmg;}

    public int getMagicDmg() {return magicDmg;}

    public int getPhysDefense() {return physDefense;}

    public int getMagicDefense() {return magicDefense;}
}

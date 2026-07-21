package models;

public class Player {
    private int level;
    private int experience;

    private int gold;
    private Inventory inventory;

    private int hp;
    private int maxHp;

    private int strength;
    private int intelligence;
    private int vitality;
    private int agility;
    private int dexterity;

    private Armor headwear;
    private Armor chestwear;
    private Armor legwear;
    private Weapon weapon;

    private int physDmg;
    private int magicDmg;
    private int physDefense;
    private int magicDefense;

    public Player(int level, int experience, int gold, Inventory inventory, int hp, int maxHp,
                  int strength, int intelligence, int vitality, int agility, int dexterity)
    {
        this.level = level;
        this.experience = experience;
        this.gold = gold;
        this.inventory = inventory;
        this.hp = hp;
        this.maxHp = maxHp;
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.agility = agility;
        this.dexterity = dexterity;
    }

    public int getLevel() {return level;}

    public void addLevel(int level) {this.level += level;}

    public int getExperience() {return experience;}

    public void addExperience(int experience) {this.experience += experience;}

    public int getGold() {return gold;}

    public void addGold(int gold) {this.gold += gold;}

    public void removeGold(int gold) {this.gold -= gold;}

    public Inventory getInventory() {return inventory;}

    public int getHp() {return hp;}

    public void setHp(int hp) {
        this.hp = hp;
        this.fixHealth();
    }

    public void addHp(int hp){
        this.hp += hp;
        this.fixHealth();
    }

    public void removeHp(int hp) {
        this.hp -= hp;
        this.fixHealth();
    }

    public int getMaxHp() {return maxHp;}

    public int getStrength() {return strength;}

    public void setStrength(int strength) {this.strength = strength;}

    public int getIntelligence() {return intelligence;}

    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}

    public int getVitality() {return vitality;}

    public void setVitality(int vitality) {this.vitality = vitality;}

    public int getAgility() {return agility;}

    public void setAgility(int agility) {this.agility = agility;}

    public int getDexterity() {return dexterity;}

    public void setDexterity(int dexterity) {this.dexterity = dexterity;}

    public Armor getHeadwear() {return headwear;}

    public void setHeadwear(Armor headwear) {this.headwear = headwear;}

    public Armor getChestwear() {return chestwear;}

    public void setChestwear(Armor chestwear) {this.chestwear = chestwear;}

    public Armor getLegwear() {return legwear;}

    public void setLegwear(Armor legwear) {this.legwear = legwear;}

    public Weapon getWeapon() {return weapon;}

    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public int getPhysDmg() {
        return physDmg;
    }

    public int getMagicDmg() { return magicDmg; }

    public int getPhysDefense() {
        return physDefense;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void fixStats(){
        maxHp = 10 + vitality + level;
        physDmg = strength + weapon.getPhysDmg();
        magicDmg = intelligence + weapon.getMagicDmg();
        physDefense = vitality + headwear.getPhysDefense() + chestwear.getPhysDefense() + legwear.getPhysDefense();
        magicDefense = vitality + headwear.getMagicDefense() + chestwear.getMagicDefense() + legwear.getMagicDefense();
    }

    public void fixHealth(){
        if (hp > maxHp) { this.hp = maxHp; }
        if (hp < 0) { this.hp = 0; }
    }

    public boolean isDead(){
        return (hp <= 0);
    }
}

package models;

public class Weapon implements Item{
    private String id;
    private String name;
    private String description;
    private String slot;

    private int physDmg;
    private int magicDmg;

    private int buyPrice;
    private int sellPrice;

    public Weapon(String id, String name, String description, String slot,
                  int physDmg, int magicDmg,
                  int buyPrice, int sellPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.slot = slot;
        this.physDmg = physDmg;
        this.magicDmg = magicDmg;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() { return description; }

    public String getSlot() { return slot; }

    public int getPhysDmg() {
        return physDmg;
    }

    public int getMagicDmg(){
        return magicDmg;
    }

    @Override
    public int getBuyPrice() {
        return buyPrice;
    }

    @Override
    public int getSellPrice() {
        return sellPrice;
    }
}

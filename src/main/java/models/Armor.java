package models;

public class Armor implements Item {
    private String id;
    private String name;
    private String description;
    private String slot;

    private int physDefense;
    private int magicDefense;

    private int buyPrice;
    private int sellPrice;

    public Armor(String id, String name, String slot, String description,
                 int physDefense, int magicDefense,
                 int buyPrice, int sellPrice)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.slot = slot;
        this.physDefense = physDefense;
        this.magicDefense = magicDefense;
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

    public String getSlot() {
        return slot;
    }

    public int getPhysDefense() {
        return physDefense;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    @Override
    public int getBuyPrice(){
        return buyPrice;
    }

    @Override
    public int getSellPrice(){
        return sellPrice;
    }
}

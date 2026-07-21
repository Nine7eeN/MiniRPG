package models;

public class Potion implements Item{
    private String id;
    private String name;
    private String description;

    private int healAmount;
    private int manaAmount;

    private int buyPrice;
    private int sellPrice;

    public Potion(String id, String name, String description,
                  int healAmount, int manaAmount,
                  int buyPrice, int sellPrice)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.healAmount = healAmount;
        this.manaAmount = manaAmount;
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

    public int getHealAmount() {
        return healAmount;
    }

    public int getManaAmount() {
        return manaAmount;
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

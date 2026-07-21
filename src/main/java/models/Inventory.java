package models;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Item> items = new LinkedList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        for (Item i : items){
            if (i.getId().equals(item.getId())){
                items.remove(item);
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Item i : items){
            sb.append("[").append(i.getName()).append("] - ").append(i.getDescription()).append("\n");
        }
        return sb.toString();
    }
}

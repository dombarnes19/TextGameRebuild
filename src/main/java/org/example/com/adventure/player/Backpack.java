package main.java.org.example.com.adventure.player;

import main.java.org.example.com.adventure.world.objects.Tangible;

public class Backpack {
    private static final int MAX_CAPACITY = 5;
    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    public boolean addItem(Tangible item) {
        for (int i = 0; i < items.length; i++) {
            if(items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    public Tangible getItem(String name) {
        for(Tangible item : items) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public boolean removeItems(Tangible item) {
        for(int i = 0; i < items.length; i++) {
            if(items[i] != null && items[i].getName().equalsIgnoreCase(item.getName())) {
                items[i] = null;
                return true;
            }
        }
        return false;
    }
    public void printItems() {
        for (Tangible item : items) {
            System.out.println("Here are the items in your backpack:\"\n" + "-" + item);

        }

    }
}

package main.java.org.example.com.adventure.player;

import main.java.org.example.com.adventure.world.objects.Tangible;

public class Player {
    public int level = 5;
    private int currentLocationIndex = AppSettings.getStartingLocation();
    private Backpack backpack = new Backpack();
    private Key key;
    private Shovel shovel;
    private int power = 10;
    private int health = 10;
    private String name;

    public boolean canOpenDoor() {
        return (float) level / 2 > 2;
    }
    public boolean move(String direction, boolean isValidDirection) {
        if (isValidDirection) {
            if(direction.equals("EAST")) {
                currentLocationIndex++;
            } else if (direction.equals("WEST")) {
                currentLocationIndex--;
            }
        } else {
            System.out.println(direction + " is not a valid direction");
        }
        return isValidDirection;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCurrentLocationIndex() {
        return currentLocationIndex;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Backpack getKey() {
        return (Backpack) getItem("key");
    }

    public void setKey(Key item) {
        this.key = item;
    }

    public Shovel getShovel() {
        return shovel;
    }

    public void setShovel(Shovel item) {
        this.shovel = item;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon item) {
        item.getPower();
    }

    public Tangible getItem(String itemName) {
        return backpack.getItem(itemName);
    }

    public Tangible removeItem(Tangible item) {
        if (backpack.removeItem(item)) {
            return item;
        } else {
            return null;
        }
    }

    public void printItems() {
        backpack.printItems();
    }

    public void addItem(Tangible item) {
        backpack.addItem(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Your name is now " + name);
    }

}

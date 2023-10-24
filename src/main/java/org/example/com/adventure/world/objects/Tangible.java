package main.java.org.example.com.adventure.world.objects;

public interface Tangible {
    String getName();
    String getDescription();
    Boolean canTake();
    Boolean canUse(Tangible item);
    void useItem(Tangible initiator);
    void use();

}

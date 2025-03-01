package model;

public class Room implements Cloneable {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room clone() {
        return new Room(this.name, this.description);
    }

    public void describe() {
        System.out.println(name + ": " + description);
    }
}

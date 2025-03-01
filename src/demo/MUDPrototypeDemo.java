package demo;

import model.Room;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room original = new Room("Treasure Room", "Filled with gold and gems");
        Room clone1 = original.clone();
        Room clone2 = original.clone();

        original.describe();
        clone1.describe();
        clone2.describe();
    }
}

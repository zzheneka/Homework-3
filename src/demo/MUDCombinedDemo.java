package demo;

import builder.SimpleDungeonBuilder;
import model.Dungeon;
import model.Room;
import model.NPC;


import builder.SimpleDungeonBuilder;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room baseRoom = new Room("Hallway", "A long dark corridor");
        Room cloneRoom1 = baseRoom.clone();
        Room cloneRoom2 = baseRoom.clone();

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(baseRoom)
                .addRoom(cloneRoom1)
                .addRoom(cloneRoom2)
                .addNPC(new NPC("Skeleton Guard"))
                .build();

        dungeon.describe();
    }

    public static class MUDBuilderDemo {
        public static void main(String[] args) {
            Dungeon dungeon = new SimpleDungeonBuilder()
                    .setDungeonName("pishera")
                    .addRoom(new Room("entrance", "dark and scary entrance"))
                    .addNPC(new NPC("Vampire"))
                    .build();

            dungeon.describe();
        }
    }
}

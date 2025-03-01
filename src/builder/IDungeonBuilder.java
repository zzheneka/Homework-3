package builder;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(model.Room room);
    IDungeonBuilder addNPC(model.NPC npc);
    model.Dungeon build();
}

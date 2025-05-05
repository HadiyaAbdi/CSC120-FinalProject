/**
 * This class represents a room in the game.
 * Its an abstract class that defines the structure for different rooms.
 * It is intended to be extended by specific room classes.
 */
public abstract class Room {
    private String name;
    protected boolean challengeCompleted = false;

    /**
     * Constructor for Room.
     * Initialises the room name.
     * @param name
     */
    public Room(String name) {
        this.name = name;
    }

    /**
     * Abstract method which defines the behavior when a player explores the room.
     * This method must be implemented by subclasses.
     * The method takes a Player object as a parameter.
     * @param player exploring the room.
     */
    public abstract void explore(Player player);
}


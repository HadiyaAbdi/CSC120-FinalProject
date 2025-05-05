/**
 * The basement class represents the basement room in the game.
 * The player can explore the basement and place clues.
 */
public class Basement extends Room {
    /**
     * Constructor for Basement.
     * initialises the basement room name by calling the superclass constructor.
     */
    public Basement() {
        super("Basement");
    }
    /**
     * Allows the player to explore the basement.
     * The player can place clues in the basement.
     * If the player has already placed clues, they are informed.
     * @param player The player exploring the room.
     */
    public void explore (Player player){
        System.out.println("You have finally placed all your clues");
    }
    
}

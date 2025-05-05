import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class represents the player in the game.
 * The player can collect clues, manage their inventory,
 * and interact with the game world.
 */

public class Player {
    private List<Clue> clues = new ArrayList<>();
    private Set<String> inventory = new HashSet<>();

    /**
     * Constructor for Player.
     * If the clues has already been collected, it will not be added again.
     * 
     * @param clue
     */
    public void collectClue(Clue clue) {
        if(!clues.contains(clue)){
            clues.add(clue);
            System.out.println("Clue collected:  " + clue.getText());
        } else {
            System.out.println("You already got this clue.");
            }
        }
        /**
         * Displays the clues collected by the player.
         * If no clues are collected, it informs the player.
         */
       public void showClue(){
        if (clues.isEmpty()){
            System.out.println("You have no clues.");
        } else {
            System.out.println("Your clues are: ");
            for (Clue c : clues) {
                System.out.println(c.getText());
            }
        }
       }
        /**
         * Checks if the player has a certain number of key clues.
         * A key clue is a clue that is essential for solving the mystery.
         * @param numberOfClues
         * @return
         */

       public boolean hasKeyClues(int numberOfClues) {
        int clueCount = 0;
        for(Clue c: clues){
            if(c.isKeyClue()){
                clueCount++;
            }}
            return clueCount >= numberOfClues;
    }
        /**
         * Removes all clues from a specific floor.
         * @param floorName
         */
        public void removeFloorClues(String floorName){
            clues.removeIf( c -> c.getText().toLowerCase().contains(floorName.toLowerCase()));
            System.out.println("You have lost all clues from the " + floorName + ".");
        }

        /**
         * Removes a specific clue from the player's collection.
         * This method is used when the player fails a challenge.
         * It searches for the clue by its text and removes it from the list.
         * @param clueText
         */
        public void loseClue(String clueText) {
            Clue toRemove = null;
            for (Clue clue : clues) {
                if (clue.getText().toLowerCase().contains(clueText.toLowerCase())) {
                    toRemove = clue;
                    break;
                }
            }
            if (toRemove != null) {
                clues.remove(toRemove);
                System.out.println("You lost the clue: " + toRemove.getText());
            } else {
                System.out.println("No matching clue to lose.");
            }
        }
        /**
         * Adds an item to the player's inventory.
         * The item is represented as a string.
         * @param item
         */
    
        public void addItem(String item) {
            inventory.add(item);
            System.out.println("You have collected: " + item);
        }
        /**
         * Checks if the player has a specific item in their inventory.
         * In this case, it checks for the "Basement Key".
         * @return
         */
        public boolean hasBasementKey() {
            return inventory.contains("Basement Key");
        }
        /**
         * Displays the player's inventory.
         * If the inventory is empty, it informs the player.
         */
        public void showInventory() {
            if (inventory.isEmpty()) {
                System.out.println(" Inventory is empty.");
            } else {
                System.out.println(" Inventory contains: ");
                for (String item : inventory) {
                    System.out.println(item);
                }
            }
        }}


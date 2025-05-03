import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private List<Clue> clues = new ArrayList<>();
    private Set<String> inventory = new HashSet<>();

    public void collectClue(Clue clue) {
        if(!clues.contains(clue)){
            clues.add(clue);
            System.out.println("Clue collected:  " + clue.getText());
        } else {
            System.out.println("You already got this clue.");
            }
        }
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
       public boolean hasKeyClues(int numberOfClues) {
        int clueCount = 0;
        for(Clue c: clues){
            if(c.isKeyClue()){
                clueCount++;
            }}
            return clueCount >= numberOfClues;
    }
        public void removeFloorClues(String floorName){
            clues.removeIf( c -> c.getText().toLowerCase().contains(floorName.toLowerCase()));
            System.out.println("You have lost all clues from the " + floorName + ".");
        }
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
    
        public void addItem(String item) {
            inventory.add(item);
            System.out.println("You have collected: " + item);
        }
        public boolean hasBasementKey() {
            return inventory.contains("Basement Key");
        }
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


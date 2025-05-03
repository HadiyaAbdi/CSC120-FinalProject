import java.util.*;

public class MysteryGame {
    private Scanner s = new Scanner(System.in);
    private Player player = new Player();
    private List<Room> rooms = new ArrayList<>();
    private boolean basementUnlocked = false;
    
    // The main method to start the game
    public static void main(String[] args) {
        MysteryGame G = new MysteryGame();
        G.start();
    }   
    // Constructor
        public void start() {
            System.out.println("Welcome to The Unlucky Curious Three! 😶‍🌫️");
            System.out.println("You have been chosen as one of the participants to play the Unlucky Curious Three.");
            System.out.println("You've always heard about the scary legend and rumors of what lies in the basement of Washburn House...");
            System.out.println("Now you will have the chance to explore it.");
            System.out.println("You will start this game alone, but as you continue, you will find the rest of your teammates in one of the four challenge floors.");
            System.out.println("Each floor has 1-2 riddle-based challenges.");
            System.out.println(" If you fail a challenge, you lose all clues from that floor and must restart it.");
            System.out.println("Your goal: explore the house, collect clues, solve riddles, and reveal the basement secret.\n");
            System.out.println(" Good luck!\n");
    
        rooms.add(new FirstFloor());
        rooms.add(new SecondFloor());
        rooms.add(new Basement());
         
        // Start the game loop
        while (true) {
            System.out.println("\nWhere do you want to go?");
            System.out.println("1. First Floor");
            System.out.println("2. Second Floor");
            System.out.println("3. Basement");
            System.out.println("4. Check Clues");
            System.out.println("5. Exit Game");

            String input = s.nextLine();

            // Check if the input is a number
            
            if (input.equals("1")) {
                rooms.get(0).explore(player);
            } else if (input.equals("2")) {
                rooms.get(1).explore(player);
            } else if (input.equals("3")) {
                if(!player.hasBasementKey()){
                 if (player.hasKeyClues(3)) {
                    player.addItem("Basement Key");
                    System.out.println("Try to open the basement! no more Hints!");
                 } else{
                    System.out.println("The basement is locked. You need to find all the clues");
                    continue;
                 }}
                    System.out.println("Use the basement keys to unlcok the dooor...");
                    basementUnlocked = true;
                    
                    System.out.println("A voice echose from distance in the dark...");
                    System.out.println("They tried to ridicule me by calling it a legend, legends are not real, but I am.");
                    System.out.println("Answer me this and the truth shall be free.");
                    System.out.println("What started as a curiosity, but turned into a nightmare?");
                    System.out.println("Your answer: ");
                    String finalRiddle = s.nextLine().toLowerCase();

                    //System.out.println("The basement is now unlocked.");
                    System.out.println("Now enter the year from your first clue:");
                    String riddle_1 = s.nextLine();
                    if(!riddle_1.equals("1878")){
                        System.out.println("Incorrect answer. Please input '1878'.");
                        continue;
                    }
                    System.out.println("Now enter your second clue:");
                    String riddle_2 = s.nextLine();
                    if(!riddle_2.equalsIgnoreCase("yes")){
                        
                        System.out.println("Incorrect answer. Please input 'yes'");
                        continue;
                    }
                    System.out.println("Now enter the name of the hall from your third clue:");
                    String riddle_3 = s.nextLine();
                    if(!riddle_3.equalsIgnoreCase("seelye")){
                        System.out.println("Incorrect answer. Please input 'seelye'. ");
                        continue;
                    }
                    //put in all the clues to form the final riddle and the secret
                    System.out.println("\n" + finalRiddle + " is the name of the book of wisdom that was buried in Washburn Basement in " + riddle_1 + " . " );
                    System.out.println("It was previously kept in " + riddle_3 + " but due to some curious students it was placed here.");
                    System.out.println("So, " + riddle_2 + " if you don't take advantage of it, it will be lost forever, AGAIN.");
                   

                    System.out.println("    ");

                    //story line of how the legend was created
                    if(finalRiddle.contains("the unlucky curious three") || finalRiddle.contains("unlucky curious three")){

                        rooms.get(2).explore(player);
                        System.out.println("The basement is now unlocked.");
                        System.out.println("The Unlucky Curious Three is a legend that was created to scare people away from the truth.");
                        System.out.println("The truth is that the basement is a place of knowledge and wisdom, and those who dare to enter will be rewarded with the secrets of the universe.");
                        System.out.println("Since Wasburn was one of the founding three houses, you acquired the wisdom of many Washburn generations!");
                        System.out.println("You have completed the game! You are now free to leave.");
                    } else {
                        System.out.println("Incorrect answer. You lose all clues!! Start the Game Again!.");
                        player.removeFloorClues("Basement");
                        player.removeFloorClues("First Floor");
                        player.removeFloorClues("Second Floor");
                    }
                // the rest of the options
            } else if (input.equals("4")) {
                player.showClue();
            } else if (input.equals("5")) {
                System.out.println("Thanks for playing! And the Legend of the Basement stays mystery...!");
                return;
            } else {
                System.out.println("Invalid option. Please choose 1–5.");
            }
        }
            }
        }
    
// integer input 

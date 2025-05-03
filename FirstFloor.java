import java.util.Scanner;
public class FirstFloor extends Room{
    private Scanner s = new Scanner(System.in);
    private int attempt = 0;
    private int attempt_2 = 0;

    public FirstFloor() {
        // Constructor for FirstFloor
        super("First Floor");
    }
    public void explore(Player player){
        if(challengeCompleted){
            System.out.println("You have already completed the challenge on this floor.");
            return;
        }
        boolean riddle_1 = false;
        attempt = 0;
        while(!riddle_1 && attempt < 4){
            System.out.println("You are on the First Floor. You see a locked door and the first riddle on the wall.");
            System.out.println(" Born in the year of 1878,\n" + //
                                "I welcomed the class of '82, fate!\n" + //
                                "When was I brought to brick and beam? "); // write riddle
            System.out.println("Input your answer: ");
            String answer = s.nextLine();
            attempt++;

        if(answer.contains("1878")){
            System.out.println("Correct! You magically found a hidden key under your foot!.");
            player.collectClue(new Clue("you have the first clue", true));
            riddle_1 = true;
            
        } else if(attempt == 2){
            System.out.println("Hint: it is part of the riddle");
        }
        else{
            System.out.println("      ");
            System.out.println("Try again");
        }
        }
        //if failed first riddle
        if(!riddle_1){
            System.out.println("Incorrect! You lose all clues from this floor.");
            player.loseClue("First Floor");
            System.out.println("You have to restart the challenge.");
            return;
        }
        // second riddle

        boolean riddle_2 = false;
        attempt_2 = 0;
        while(!riddle_2 && attempt < 4){
            System.out.println("You walk passed three rooms in the First Floor and you see the second riddle on the ground.");
            System.out.println("Is Wahburn Animal Free or not?? Put YES or NO "); // write riddle
            System.out.println("Input your answer: ");
            String answer = s.nextLine();
            attempt_2++;

            if(answer.contains("Yes") || answer.contains("yes") || answer.contains("YES")){
                System.out.println("Correct! You magically found a hidden key under the carpet!.");
                player.collectClue(new Clue("you have the second clue", true));
                riddle_2 = true;
                
            } else if(attempt_2 == 2){
                System.out.println("Hint: it was not a no");
            }
            else{
                System.out.println("Try again");
            }
            }
            //if failed first riddle
            if(!riddle_2){
                System.out.println("Incorrect! You lose all clues from this floor.");
                player.loseClue("First Floor");
                System.out.println("You have to restart the challenge.");
                return;
            }


    }
}

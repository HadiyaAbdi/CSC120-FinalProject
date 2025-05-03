import java.util.Scanner;
public class SecondFloor extends Room{
    private Scanner s = new Scanner(System.in);
    private int attempts = 0;

    public SecondFloor() {
        // Constructor for FirstFloor
        super("Second Floor");
    }
    public void explore(Player player){
        if(challengeCompleted){
            System.out.println("You have already completed the challenge on this floor.");
            return;
        }
        boolean riddle_3 = false;
        attempts = 0;
        while(!riddle_3 && attempts < 4){
            System.out.println("You are on the Second Floor. You see a locked door and the third riddle on the door.");
            System.out.println("Each morning I await the rising sun, But one grand building blocks my fun. Its halls of thought stretch far and wide —What name does this structure proudly hide?"); // write riddle
            System.out.println("Input your answer: ");
            String answer = s.nextLine();
            attempts++;

        if(answer.contains("Seelye") || answer.contains("seelye") || answer.contains("SEELYE")){
            System.out.println("Correct! You found a hidden key!.");
            player.collectClue(new Clue("you have the third clue", true));
            riddle_3 = true;
            
        } else if(attempts == 2){
            System.out.println("Hint: its a hall but dont write the word 'hall' with it");
        }
        else{
            System.out.println("Try again");
        }
        }
        //if failed first riddle
        if(!riddle_3){
            System.out.println("Incorrect! You lose all clues from this floor.");
            player.loseClue("Second Floor");
            System.out.println("You have to restart the challenge.");
            return;
        }

    }
}

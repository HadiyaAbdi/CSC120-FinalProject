/**
 * The clue class represents a clue in the game.
 * It contains the clue text, whether it is a key clue,
 * and whether it has been found.
 */
public class Clue {
    private String text;
    private boolean keyClue;
    private boolean isFound;

    /**
     * Constructor for Clue.
     * Initialises the clue text and whether it is a key clue.
     * @param text
     * @param keyClue
     */

    public Clue(String text, boolean keyClue) {
        this.text = text;
        this.keyClue = keyClue;
    }
    /**
     * Returns the clue text. Gets the description of the clue.
     * @return
     */
    public String getText(){
        return text;
    }
    /**
     * Returns whether the clue is a key clue.
     * @return
     */
    public boolean isKeyClue() {
        return keyClue;
    }
    /**
     * Sets the clue as found.
     * @param isFound
     */
    @Override
    public boolean equals(Object o){
        if(o instanceof Clue){
            return this.text.equals(((Clue) o).text);
        }
        return false;
    }
    /**
     * Returns the hash code of the clue based on the text.
     * This is used to check if the clue is already collected.
     * @return
     */
    @Override
    public int hashCode(){
        return text.hashCode();
    }
    
}

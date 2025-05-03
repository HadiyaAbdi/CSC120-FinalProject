public class Clue {
    private String text;
    private boolean keyClue;
    private boolean isFound;

    public Clue(String text, boolean keyClue) {
        this.text = text;
        this.keyClue = keyClue;
    }
    public String getText(){
        return text;
    }
    public boolean isKeyClue() {
        return keyClue;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Clue){
            return this.text.equals(((Clue) o).text);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return text.hashCode();
    }
    
}

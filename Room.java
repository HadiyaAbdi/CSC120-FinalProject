public abstract class Room {
    private String name;
    protected boolean challengeCompleted = false;

    public Room(String name) {
        this.name = name;
    }
    public abstract void explore(Player player);
}


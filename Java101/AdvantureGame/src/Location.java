import java.util.Scanner;

public abstract class Location {
    protected static Scanner scanner=new Scanner(System.in);

    private int id;
    private String name;
    private Player player;

    public Location(int id,String name,Player player){
        this.id=id;
        this.name=name;
        this.player=player;

    }

    public abstract boolean onLocation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
import java.util.Random;

public class Player {
    private Random random;
    private int characterNumber;
    private Character character;
    private Inventory inventory;
    private String username;
    private Location location;

    public Player(int characterNumber,String username,Inventory inventory){
        this.characterNumber=characterNumber;
        if(username.equals(""))
            username="Player1";
        this.username=username;
        this.inventory=inventory;
    }

    public void selectChar(){
        switch (this.characterNumber){
            case 1:
            default:
                this.character=new Samurai();
                break;
            case 2:
                this.character=new Archer();
                break;
            case 3:
                this.character=new Knight();
                break;
        }
    }

    public boolean selectLocation(int locId){
        switch (locId){
            case 1:
            default:
                this.location=new SafeHouse(this);
                break;
            case 2:
                this.location=new ToolStore(this);
                break;
            case 3:
                if(isWinLoc(new Forest(this))){
                    this.location=new SafeHouse(this);
                    break;
                }else {
                    this.location = new Forest(this);
                    break;
                }
            case 4:
                if(isWinLoc(new Cave(this))){
                    this.location=new SafeHouse(this);
                    break;
                }else {
                    this.location = new Cave(this);
                    break;
                }
            case 5:
                if(isWinLoc(new River(this))){
                    this.location=new SafeHouse(this);
                    break;
                }else {
                    this.location=new River(this);
                    break;
                }
            case 6:
                this.location=new Mine(this);
                break;
            case 7:
                getItemList();
                return true;
        }
        return location.onLocation();
    }
    private int numOfSnake(){
        return random.nextInt(1,6);
    }

    private boolean isWinLoc(BattleLoc battleLoc){
        if(battleLoc.getId()==3 && this.getInventory().isWood()){
            System.out.println("Bu alanda savası kazandınız. Tekrar Giremezsiniz.");
            return true;
        }
        if(battleLoc.getId()==4 && this.getInventory().isFood()){
            System.out.println("Bu alanda savası kazandınız. Tekrar Giremezsiniz.");
            return true;
        }
        if(battleLoc.getId()==5 && this.getInventory().isWater()){
            System.out.println("Bu alanda savası kazandınız. Tekrar Giremezsiniz.");
            return true;
        }
        return false;

    }

    private void getItemList() {
        System.out.println("Silah : "+this.getInventory().getWeapon().getName());
        System.out.println("Zırh : "+this.getInventory().getArmor().getName());
        System.out.println("Water : "+this.getInventory().isWater());
        System.out.println("Food : "+this.getInventory().isFood());
        System.out.println("Wood : "+this.getInventory().isWood());
    }

    public boolean win(){
        return this.getInventory().isWood() && this.getInventory().isFood() && this.getInventory().isWater();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCharacterNumber() {
        return characterNumber;
    }

    public void setCharacterNumber(int characterNumber) {
        this.characterNumber = characterNumber;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public int getPlayerHealth(){
        return this.getCharacter().getHealth();
    }
    public int getPlayerDamage(){
        return this.getCharacter().getDamage();
    }
    public int getPlayerMoney(){
        return this.getCharacter().getMoney();
    }
    public int getPlayerDefence(){
        return this.getInventory().getArmor().getDefence();
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return  "Oyuncunun Özellikleri :\n" +
                "Username = " + this.username +
                ", Seçilen karakter= " + this.character.getName() +
                ", Karakter canı = " + this.character.getHealth() +
                ", Karakterin başlangıçtaki hasarı = " + this.character.getDefaultDamage() +
                ", Karakterin toplam hasarı = "+this.getCharacter().getDamage()+
                ", Paranız = " + this.getCharacter().getMoney() +
                ", Zırh savunması ="+this.getInventory().getArmor().getDefence()+
                ", Silah hasarı ="+this.getInventory().getWeapon().getDamage();
    }

}

public class Weapon {
    private int id;
    private String name;
    private int damage;
    private int money;

    Weapon(int id,String name,int damage,int money){
        this.id=id;
        this.name=name;
        this.damage=damage;
        this.money=money;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

}
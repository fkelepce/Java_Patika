
import java.util.Random;
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    int chance;

    Fighter(String name, int damage, int health, int weight, int dodge, int chance){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.chance = chance;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " hit to => " + foe.name + " " + this.damage );
        if (foe.isDodge()){
            System.out.println(foe.name + " blocked the damage! ");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber < this.dodge;
    }

}

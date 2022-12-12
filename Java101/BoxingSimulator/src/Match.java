public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int starter;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1= f1;
        this.f2= f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight ) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean starterFinder(){
        if (this.f1.chance > this.f2.chance){
            return true;
        } else {
            return false;
        }
    }

    void run(){
        if (isCheck())
            if(starterFinder()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("=======NEW ROUND=======");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Health: " + this.f1.health);
                    System.out.println(this.f2.name + " Health: " + this.f2.health);
                }
            }else {
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("=======NEW ROUND=======");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " Health: " + this.f1.health);
                    System.out.println(this.f2.name + " Health: " + this.f2.health);
                }
            }
        else {
            System.out.println("Weight does not match");
        }
    }

    boolean isWin(){
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won !");
            return true;
        }

        return  false;
    }


}

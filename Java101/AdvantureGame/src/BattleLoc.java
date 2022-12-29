import java.util.Locale;
import java.util.Random;

public abstract class BattleLoc extends Location{

    Random random=new Random();

    private Obstacle obstacle;
    private String award;
    private int numObs;

    public BattleLoc(int id, String name, Player player,Obstacle obstacle,String award) {
        super(id, name, player);
        this.obstacle=obstacle;
        this.award=award;
    }

    @Override
    public boolean onLocation() {
        System.out.println("Şuan bulunduğunuz yer : "+this.getName());
        setNumObs(this.getId());
        System.out.println("Dikkatli olun burada "+this.getNumObs()+" adet " +this.getObstacle().getName().toUpperCase()+ " yaşıyor!");
        System.out.print("Bu canavarla savaşmak için 'S' kaçmak için 'K' basınız : ");
        String sel=scanner.nextLine().toUpperCase();
        if(sel.equals("S")){
            if(!combat(getNumObs()) && this.getPlayer().getPlayerHealth()==0){
                return false;
            }
        }
        else if(sel.equals("K")){
            System.out.println("Canavardan kaçtınız.");
        }
        else {
            System.out.println("Yanlış girdiniz! Ana Ekrana dönülüyor");
        }
        return true;
    }

    public boolean combat(int value){
        boolean isFirst=true;
        for (int i = 1; i <= value; i++) {
            if(this.getObstacle().getName().equals("Yılan")){
                System.out.println("***********------------------*************--------------***********----------");
                this.getObstacle().setDamage(this.getObstacle().snakeDamage());
            }
            System.out.println(this.getPlayer().toString());
            System.out.println(this.obstacle.toString());
            boolean finish=true;
            while (this.obstacle.getHealth()>0 && this.getPlayer().getPlayerHealth()>0){
                if(firstShot()==2 && isFirst) { //ilk olarak oyuncu vuruyor
                    System.out.println("Vuruş Hakkı Sizle Başlıyor.");
                    System.out.println("Vurmak için 'V' , kaçmak için 'K' basınız .");
                    String match = scanner.nextLine().toUpperCase(Locale.ROOT);
                    if (match.equals("V")) {
                        System.out.println(this.getPlayer().getNick() + " " + this.obstacle.getName() + " canavarına "
                                + this.getPlayer().getPlayerDamage() + " puan hasar vurdunuz!");
                        int obsHealth = this.getObstacle().getHealth() - this.getPlayer().getPlayerDamage();
                        this.getObstacle().setHealth(obsHealth);
                        System.out.println(this.obstacle.getName() + " canavarının canı " + this.getObstacle().getHealth() + " kaldı.");
                        if (this.getObstacle().getHealth() > 0) { //canavar ölmezse bize vuruyor
                            System.out.println(i + ". Canavar Size Vurdu !");
                            int damage = this.getObstacle().getDamage() - getPlayer().getPlayerDefence();
                            if (damage < 0) damage = 0;
                            this.getPlayer().getCharacter().setHealth(this.getPlayer().getPlayerHealth() - damage);
                            System.out.println("Canınız : " + this.getPlayer().getPlayerHealth());
                            if (this.getPlayer().getPlayerHealth() == 0) {
                                return false;
                            }
                        }
                    }
                    else {
                        System.out.println("Savaş alanından kaçtınız.");
                        return true;
                    }
                }
                else {
                    finish = true;
                    isFirst = false;
                    System.out.println("Vuruş Hakkı Canavarla Başlıyor.");
                    System.out.println(i + ". Canavar Size Vurdu !");
                    int damage = this.getObstacle().getDamage() - getPlayer().getPlayerDefence();
                    if (damage < 0) damage = 0;
                    this.getPlayer().getCharacter().setHealth(this.getPlayer().getPlayerHealth() - damage);
                    System.out.println("Canınız : " + this.getPlayer().getPlayerHealth());
                    if (this.getPlayer().getPlayerHealth() < 1) {
                        return false;
                    }
                    System.out.println("Vurmak için 'V' , kaçmak için 'K' basınız .");
                    String match = scanner.nextLine().toUpperCase(Locale.ROOT);
                    if (match.equals("V")) {
                        System.out.println(this.getPlayer().getNick() + " " + this.obstacle.getName() + " canavarına "
                                + this.getPlayer().getPlayerDamage() + " puan hasar vurdunuz!");
                        int obsHealth = this.getObstacle().getHealth() - this.getPlayer().getPlayerDamage();
                        this.getObstacle().setHealth(obsHealth);
                        System.out.println(this.obstacle.getName() + " canavarının canı " + this.getObstacle().getHealth() + " kaldı.");
                    } else {
                        System.out.println("Savaş alanından kaçtınız.");

                        return true;
                    }
                }
            }
            if(this.getObstacle().getHealth()<=0){
                isFirst=true;
                int x=value-i;
                System.out.println("Kazandınız. Canavar Öldü.Kalan Canavar Sayısı :"+x);
                if(this.getObstacle().getName().equals("Yılan")){
                    snakeAward();
                }else {
                    giveMoney(getObstacle().getAwardMoney());
                    System.out.println("Ödülünüz verildi . Bakiyeniz : " + this.getPlayer().getPlayerMoney());
                    if(x==0) {
                        giveItem(this.getAward());
                        System.out.println(this.getAward() + " ödülünü kazandınız!");
                    }
                }
                if(x!=0){
                    this.getObstacle().setHealth(this.getObstacle().getDefaultHealth());
                }
            }
        }
        return true;
    }

    private void snakeAward() {
        System.out.println("Yılanı öldürdüğünüz için bir ödül çekilişi hak ettiniz!");
        int awardRand=random.nextInt(1,101);
        //1-46 arası hiçbir ödül çıkmama ihtimalidir, 46-101 ise 3 farklı ödülden biri çıkma ihtimalidir.
        if(awardRand<=45){
            System.out.println("Herhangi bir ödül kazanamadınız.");
        }
        else {
            int awd=random.nextInt(1,101);
            if(awardRand<=60){

                if(awd<=20){
                    this.getPlayer().getInventory().setWeapon(new Rifle());
                }
                else if(awd<=50){
                    this.getPlayer().getInventory().setWeapon(new Sword());
                }
                else {
                    this.getPlayer().getInventory().setWeapon(new Gun());
                }
                System.out.println(getPlayer().getInventory().getWeapon().getName()+ " kazandınız!");
                this.getPlayer().getCharacter().setDamage(this.getPlayer().getPlayerDamage()+getPlayer().getInventory().getWeapon().getDamage());
            }
            else if(awardRand<=75){
                if(awd<=20){
                    this.getPlayer().getInventory().setArmor(new HeavyArmor());
                }
                else if(awd<=50){
                    this.getPlayer().getInventory().setArmor(new MediumArmor());
                }
                else {
                    this.getPlayer().getInventory().setArmor(new LightArmor());
                }
                System.out.println(getPlayer().getInventory().getArmor().getName()+ " kazandınız!");
            }
            else {
                int money=0;
                if(awd<=20){
                    this.getPlayer().getCharacter().setMoney(this.getPlayer().getPlayerMoney()+10);
                    money=10;
                }
                else if(awd<=50){
                    this.getPlayer().getCharacter().setMoney(this.getPlayer().getPlayerMoney()+5);
                    money=5;
                }
                else {
                    this.getPlayer().getCharacter().setMoney(this.getPlayer().getPlayerMoney()+1);
                    money=1;
                }
                System.out.println(money+" Para Kazandınız. Mevcut Bakiyeniz : "+this.getPlayer().getPlayerMoney());
            }

        }
    }

    private int firstShot(){
        Random r=new Random();
        int x= r.nextInt(1,3);
        return x;
    }

    private void giveMoney(int awardMoney) {
        this.getPlayer().getCharacter().setMoney(this.getPlayer().getPlayerMoney()+awardMoney);
    }
    private void giveItem(String award){
        if(award.equals("food")){
            getPlayer().getInventory().setFood(true);
        }
        if(award.equals("water")){
            getPlayer().getInventory().setWater(true);
        }
        if(award.equals("wood")){
            getPlayer().getInventory().setWood(true);
        }
    }

    public int getNumObs() {
        return numObs;
    }

    public void setNumObs(int id) {
        if(id<6){
            this.numObs = random.nextInt(1,4);
        }else {
            this.numObs=random.nextInt(1,6);
        }
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
}
import java.util.Scanner;

public class Game {

    Scanner scanner=new Scanner(System.in);

    private Player player;
    private Location location;
    private Weapon weapon=new Weapon(0,"Yok",0,0);
    private Armor armor=new Armor(0,"Yok",0,0);
    private Inventory inventory=new Inventory(false,false,false,weapon,armor);

    public void start(){
        System.out.println("MACERA OYUNUNA HOŞGELDİNİZ.");
        System.out.println("---------------------------");
        System.out.print("Nickinizi Giriniz : ");
        String nick=scanner.next();
        int characterNumber;
        Character[] charList={new Samurai(),new Archer(),new Knight()};
        while (true) {
            System.out.println("Karakter Listesi ");
            for (Character chr : charList){
                System.out.print(chr.getId()+"-"+ chr.getName() + " : Hasar="+chr.getDamage() +" Sağlık="+chr.getHealth()+" Para="+chr.getMoney()+"\n");
            }
            System.out.print("Seçmek istediğiniz karakter numarasını giriniz : ");

            characterNumber = scanner.nextInt();
            if(characterNumber>3 || characterNumber<1){
                System.out.println("Yanlış numara girdiniz lütfen tekrar deneyin.");
            }else{
                break;
            }
        }
        player = new Player(characterNumber,nick,inventory);
        player.selectChar();
        while (true){
            System.out.println(player.toString());
            System.out.println("Lokasyon Listesi :");
            System.out.println("-------------------------------------------------------");
            Location[] locations={new SafeHouse(player),new ToolStore(player),
                    new Forest(player),new Cave(player),new River(player),new Mine(player)};
            for(Location loc: locations){
                System.out.println(loc.getId()+"-"+loc.getName());
            }
            System.out.println("7-Envanter");
            System.out.println("9-Oyunu Sonlandır.");
            System.out.print("Gitmek istediğiniz lokasyonun numarasını yazınız : ");
            int locationId=scanner.nextInt();

            if(locationId==9){
                System.out.println("Oyundan çıkış yapılıyor. Tekrar bekleriz!");
                System.exit(0);
            }
            if(!player.selectLocation(locationId)){
                System.out.println("Oyun bitti! Kaybettiniz!");
                break;
            }
        }
    }
}
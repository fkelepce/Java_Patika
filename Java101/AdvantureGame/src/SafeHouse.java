public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(1,"Güvenli ev" ,player);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz.");
        if(getPlayer().win()){
            System.out.println("Tebrikler, tüm itemleri topladınız ve oyunu kazandınız.");
            System.exit(0);
        }
        System.out.println("Mevcut Sağlığınız :"+getPlayer().getCharacter().getHealth());
        System.out.println("Canınız yenilendi.");
        getPlayer().getCharacter().setHealth(getPlayer().getCharacter().getDefaultHealth());
        System.out.println("Sağlığınız :"+getPlayer().getCharacter().getHealth());
        return true;
    }
}
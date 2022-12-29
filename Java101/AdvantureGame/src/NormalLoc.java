public abstract class NormalLoc extends Location{

    public NormalLoc(int id,String name, Player player) {
        super(id,name, player);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}

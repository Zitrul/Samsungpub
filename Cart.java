public class Cart {
    public String USL;
    public int damage;
    public int dohod;
    public int sfera_damage;
    public int sfera_dohod;
    public Cart(String USL,int sfera_damage, int sfera_dohod, int damage, int dohod){
        this.damage = damage;
        this.sfera_damage = sfera_damage;
        this.dohod = dohod;
        this.sfera_dohod = sfera_dohod;
        this.USL = USL;

    }
}

public class Choise {
    private float koifV;
    private Cart cart1;
    private Cart cart2;
    private int vibor_counter;

    public Choise(Cart cart1, Cart cart2, float koifV, int vibor_counter) {
        this.cart1 = cart1;
        this.cart2 = cart2;
        this.koifV = koifV;
        this.vibor_counter = vibor_counter;
    }

    public double CountDamage(int num) {
        if (num == 1) {
            return koifV * Math.random() + cart1.damage;
        } else {
            return koifV * Math.random() + cart2.damage;
        }

    }
    public int SferaDamage(int num){
        if(num == 1){
            return cart1.sfera_damage;
        }
        else{
            return cart2.sfera_damage;
        }

    }
    public int SferaDohod(int num){
        if(num == 1){
            return cart1.sfera_dohod;
        }
        else{
            return cart2.sfera_dohod;
        }

    }

    public double CountDohod(int num) {
        if (num == 1) {
            return koifV * Math.random() + cart1.dohod;
        } else {
            return koifV * Math.random() + cart2.dohod;
        }

    }

    public void vibor() {
        System.out.println("Решение номер" + vibor_counter + "\n" + cart1.USL + "\n" + "2-" + cart2.USL);

    }


}

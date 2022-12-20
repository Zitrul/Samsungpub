public class Imperator {
    protected double economic;
    protected double army;
    protected double food;
    void printinfo(){
        System.out.println("На данный момент в вашей старне:\n"+"Качество армии:"+army+"\nУровень экономики"+economic+"\nУровень еды:"+food);

    }
    boolean amIalive(){
        if(economic>0 || army > 0 || food >0){
            return true;
        }
        else{
            return false;
        }

    }
    public void sferaplus(int sfera, double dohod){
        if(sfera == 1){
            this.army += dohod;
        } else if (sfera ==  2) {
            this.economic += dohod;

        }else{
            this.food+= dohod;
        }
    }
    public void sferaminus(int sfera, double damage){
        if(sfera == 1){
            this.army -= damage;
        } else if (sfera ==  2) {
            this.economic -= damage;

        }else{
            this.food-= damage;
        }
    }
    public Imperator(double economic, double food,double army){
        this.economic = economic;
        this.food = food;
        this.army = army;
    }


}

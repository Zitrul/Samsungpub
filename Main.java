import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Imperator Zitrul = new Imperator(1000,1000,1000);
        Cart cartx = new Cart("Урезатть всем зарплату кроме армии", 2,3, 100,50);
        Cart carty = new Cart("Вместо 30% выделить армии 60% годового дохода империи", 2,1, 50,80);

        Choise c  = new Choise(cartx,carty,0.8f,1);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Zitrul.sferaplus(c.SferaDohod(a),c.CountDohod(a));
        Zitrul.sferaminus(c.SferaDamage(a),c.CountDamage(a));
        Zitrul.printinfo();
        System.out.println("Hello world!");
    }
}

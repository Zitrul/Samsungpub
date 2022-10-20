public class NumberDigits {
    //Write your code here
    public static void binFraction(double x, int n) {
        
        for (int i = 0; i < n; i++) {
            x  = x*2;

            System.out.print((int)x);

            x = x - (int)x;
        }
    }
}

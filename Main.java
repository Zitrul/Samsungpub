
import java.util.Scanner;
public class NumberDigits{

    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n = n /10;
        }

        return sum;

    }
    public static int sumOfThirteen(int n){
        int sum = 0;
        for(int i = 0; i <n; i++){
            if(sumOfDigits(i)%13== 0){
                sum+=1;
            }

        }
        return sum;
    }
    public static void binFraction(double x, int n) {
        
        for (int i = 0; i < n; i++) {
            x  = x*2;

            System.out.print((int)x);

            x = x - (int)x;
        }
    }
      public static int sumOfSeven(int a, int b){
        int sum = 0;
        for(int i = a; i <=b; i++){
            if(i%7 == 0 && i >9 && i<100){
                sum+=sumOfDigits(i);
            }

        }
        return sum;
    }
}

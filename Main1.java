public class NumberDigits {
    //Write your code here
    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n = n /10;
        }

        return sum;

    }
    
}

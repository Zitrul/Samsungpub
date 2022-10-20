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

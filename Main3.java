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
    public static int sumOfThirteen(int n){
        int sum = 0;
        for(int i = 0; i <n; i++){
            if(sumOfDigits(i)%13== 0){
                sum+=1;
            }

        }
        return sum;
    }
}

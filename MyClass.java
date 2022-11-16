class MyClass {
    static int count = 0;
    public MyClass() {
        count+= 1;
    }
    public static int countObj() {
       return count;
    }
}


Test.s();


public class Duplicator {
   private Duplicator() {}
   static String str(String a){
       return a+a;
   }
}


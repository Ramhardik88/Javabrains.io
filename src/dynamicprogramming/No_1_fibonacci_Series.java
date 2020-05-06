package dynamicprogramming;

public class No_1_fibonacci_Series {
    public static void main(String[] args) {
              int n=3;
      //  System.out.println(fibonacciBottomup( n));

        System.out.println(fibonaccitopdown(n));
    }

    private static int fibonaccitopdown(int n) {

        int fib[]=new int [n+1];
        if(n==0) return 0;
        if (n==1) return 1;
        if(fib[n]!=0)
        {
            return fib[n];
        }
        else {
            fib[n]=fibonaccitopdown(n-1)+fibonaccitopdown(n-2);
        }
        return fib[n];
    }

//    private static int fibonacciBottomup(int n) {
//        int num[]=new int[n+1];
//        if(n<1)
//        {
//            System.out.println("error in input ");
//        }
//        num[0]=0;
//        num[1]=1;
//        for(int i=2;i<=n;i++)
//        {
//            num[i]=num[i-1]+num[i-2];
//        }
//
//        return num[n];
//    }
}

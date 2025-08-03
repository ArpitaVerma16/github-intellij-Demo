package Recursion;

public class fibonacci {
    static int fib(int n){
        if(n==0||n==1) return n;
        int prev = fib(n-1);
        int prevPrev = fib(n-2);
        return prev +prevPrev;
    }
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}

package Recursion;

public class sumFromOf1toN {
    static int sum(int n){
        if(n==0||n==1) {
return n;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}

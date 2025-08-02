package Recursion;

public class printDecreasing {
    static void print(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        print(5);

    }
}

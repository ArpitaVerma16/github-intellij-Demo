package Recursion;

public class power {
    static int exponent(int p,int q){
        if(q==0) return 1;
        return p*exponent(p,q-1);
    }
    public static void main(String[] args) {
        System.out.println(exponent(2,5));
    }
}

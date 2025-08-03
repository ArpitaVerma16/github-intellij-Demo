package Recursion;

public class power {
    static int exponent(int p,int q){
//        if(q==0) return 1;
//        return p*exponent(p,q-1);

        if(q==0) return 1;
        int smallPow = exponent(p,q/2);
        if(q%2==0) return smallPow*smallPow;
        else return smallPow*smallPow*p;
   }
    public static void main(String[] args) {
       System.out.println(exponent(2,5));
    }
}

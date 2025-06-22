package Conditionals;

public class Triangleornot {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 2;
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("valid Triangle");
        }else{
            System.out.println("invalid triangle");
        }
    }
}

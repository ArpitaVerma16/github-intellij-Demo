package Conditionals;

public class Nestedifelse {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }else{
                System.out.println("c is largest");
            }
        }else{
            if(b>c){
                System.out.println("b is greater");
            }else{
                System.out.println("c is largest");
            }
        }
    }
}

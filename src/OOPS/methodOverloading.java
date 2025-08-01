package OOPS;

public class methodOverloading {
    public static void add(int a,int b){
        System.out.println("integer arguments");
    }
    public static void add(float a,float b){
        System.out.println("float arguments");
    }
    public static void add(double a,double b){
        System.out.println("double arguments");
    }

    public static void main(String[] args) {
        add(10,20);
        add(10.2f,20.2f);
        add(10.0,20.0);
    }
}

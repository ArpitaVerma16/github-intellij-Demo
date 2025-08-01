package OOPS;

public class methodOverloading1 {
   static class Sample{

    public void methodOne(String s) {
        System.out.println("string version");
    }

    public void methodOne(Object o) {
        System.out.println("object version");
    }
}
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne("Arpita");
        s.methodOne(new Object());
        s.methodOne(null);//compiler bind with string version
    }
}

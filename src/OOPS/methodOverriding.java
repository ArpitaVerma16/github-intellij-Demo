package OOPS;

public class methodOverriding {
   static class Parent{
        public void property(){
           System.out.println("Land+cash+gold");
       }
       public void marry(){
           System.out.println("Relative girl");
       }
    }
    static class Child extends Parent{
       public void marry(){
           //re- implementation
           System.out.println("some other girl");
       }
    }
    public static void main(String[] args) {
       //parent object
     Parent p1 = new Parent();
     p1.property();
     p1.marry();
     System.out.println();
        //child object
        Child c1 = new Child();
        c1.property();
        c1.marry();
        System.out.println();
        // child object
        Parent p = new Child();
        p.property();
        p.marry();

    }
}

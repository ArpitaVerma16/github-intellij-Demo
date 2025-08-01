package OOPS;

import java.util.*;

public class overriding {
   static  class Plane{
        public void takeOf(){
            System.out.println("takeOf plane");
        }
       public void fly(){
           System.out.println(" flying");
       }

    }
    static class Cargoplane extends Plane {
        public void takeOf(){
            System.out.println("takeOf cargo-plane");
        }
        public void fly(){
            System.out.println("cargo-plane flying");
        }
    }
    static class Airport {
        public void allowPlane(Plane p) {
            p.takeOf();
            p.fly();
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Plane p = new Plane();
         Cargoplane c = new Cargoplane();

         Airport a = new Airport();
         a.allowPlane(p);
         a.allowPlane(c);
    }
}

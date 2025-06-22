package METHODS;

import java.util.Scanner;

public  class areaofcircle {

    public static double areaOfCircle(float radius){
     double Area = 3.14*radius*radius;
     return Area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

      double area =  areaOfCircle(radius);
      System.out.println(area);
    }
}

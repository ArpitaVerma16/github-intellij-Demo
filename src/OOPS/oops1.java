import java.util.*;

public class oops1 {
    //creating a new data type
    public static  class Student{
        String name;
        int rno;
        double percent;
        // we need add the values one by one every object
        Student(int rno,String name,Double percent){ //constructor
            this.rno = rno;
            this.name = name;
            this.percent = percent;
        }
    }

//    public static class Car{
//        String name;
//        String type;
//        int price;
//    }
    public static void main(String[] args) {
//        Car c1 = new Car();
//        c1.name ="Alto";
//        c1.price = 400000;
//        c1.type = "hatchback";
//        System.out.println(c1.name);



       Student x = new Student(15,"Aradhya",85.7);
//       x.name = "Arpita";
//       x.rno = 17;
//       x.percent = 95;
//       System.out.println(x.rno + 10);
//
//       Student s = new Student();
////       s.name = "Anuj";
//       System.out.println(s.name);


    }
}

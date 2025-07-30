package OOPS;

public class childAndBaseClass {
    static class Person{
        public int age;
        public String name;
        public String address;
    }
    static class Student extends  Person{
        public int RollNo;
        public int marks;
        Student(int age,String name,String address,int RollNo,int marks){
            System.out.println("called during object creation!");
            this.age = age;
            this.name = name;
            this.address = address;
            this.RollNo = RollNo;
            this.marks = marks;
        }
        public void display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
            System.out.println(RollNo);
            System.out.println(marks);
        }
    }
    public static void main(String[] args) {
     Student s1 = new Student(18,"Arpita","Gorakhpur",17,98);
     s1.display();
    }
}

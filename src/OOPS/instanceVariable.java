package OOPS;

public class instanceVariable {
    static class Student{
        public int age;
        public String name;

        Student(int age,String name){
            //instance variable
            this.age = age;
            this.name = name;
        }
        //instance method
        public void display(){
            System.out.println(name);
            System.out.println(age);
        }
    }
    public static void main(String[] args) {
         Student std1 = new Student(18,"Arpita");
         std1.display();
         Student std2 = new Student(19,"sandhya");
         std2.display();
    }
}

package OOPS;

public class zeroArgumentConstructor {
    static class Employee{
        public int empId;
        public String empName;
        Employee(){
            System.out.println("constructor called");
        }
        public void display(){
            System.out.println(empId);//0
            System.out.println(empName);//null
        }
    }


    public static void main(String[] args) {
Employee e1 = new Employee();
e1.display();
    }
}

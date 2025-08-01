package OOPS;

public class settersAndGetters {
    static class Employee{
        //Data hiding
        private String name;
        private int salary;
        private String company;
        //setter methods
        public void setName(String name){
          this.name = name;
        }
        public void setSalary(int salary){
          this.salary = salary;
        }
        public void setCompany(String company){
          this.company = company;
        }

        //getter methods
        public String getName(){
            return name;
        }
        public int getSalary(){
            return salary;
        }
        public String getCompany(){
            return company;
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //calling setter methods
        e1.setName("Arpita");
        e1.setSalary(50000);
        e1.setCompany("Google");

        //calling getter method
        System.out.println( e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getCompany());
    }
}

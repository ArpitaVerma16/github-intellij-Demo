package OOPS;

public class studentApp {
   static class Student{
        // Data security
        private int roll;
        private String name;
        private String address;

        //Setter methods
        public void setRoll(int roll){
            this.roll = roll;
        }
        public void setName(String name){
           this.name = name;
        }
        public void setAddress(String address){
            this.address = address;
        }

        //getter method
        public int getRoll(){
            return roll;
        }
        public String getName(){
            return name;
        }
        public String getAddress(){
            return address;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        // calling setter methods
        s1.setRoll(17);
        s1.setName("Arpita");
        s1.setAddress("Gorakhpur");

        //calling getter methods
        System.out.println(s1.getRoll());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());


    }
}

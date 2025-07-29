package OOPS;

public class Authentication {
    static class Account{
        private double balance;
        public void getBalance(double balance){
           boolean result =  validate("Arpita","Arpita123");
            //withdraw the money
            if(result == true){
                this.balance -= balance;
                System.out.println("succesfully withdrawing"+" "+balance);
            }
            else System.out.println("invalid username or password!!");
        }
        public void setBalance(double balance){
            boolean result = validate("Arpita","Arpita123");
            //deposite the money
            if(result==true){
                this.balance += balance;
                System.out.println("succesfully deposited"+" "+balance);
            }else{
                System.out.println("invalid username or password");
            }
        }
        private boolean validate(String username, String password){
            return username.equalsIgnoreCase("Arpita") && password.equals("Arpita123");
        }
    }
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);
        acc.getBalance(500.0);
    }
}

package OOPS;

public class staticVariable {
   static class LoanApp{
        static float rateOfInterest = 9.5f;
    }
    public static void main(String[] args) {
        System.out.println(LoanApp.rateOfInterest);
    }
}

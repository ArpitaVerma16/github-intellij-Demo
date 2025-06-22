package Conditionals;

public class profitloss {
    public static void main(String[] args) {
        int sp = 1000;
        int cp = 990;
        if(sp>cp){
            System.out.println("Profit gained");
        }else if(sp < cp){
            System.out.println("Loss");
        }else{
            System.out.println("no profit no loss");
        }
    }
}

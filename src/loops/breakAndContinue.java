package loops;

import java.util.Scanner;

public class breakAndContinue {
    public static void main(String[] args) {
        //composite number(have factors)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0){
                System.out.println("composite number");
                flag = true;
                break;
        }
    }
        if(n==1) System.out.println("neither prime nor composite");
        else if(flag==false) System.out.println("prime number");
  }
}

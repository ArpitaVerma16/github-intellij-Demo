package loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,rem = 0;
        while(n!=0){
            rem = n%10;
            sum += rem;
            n = n/10;
        }
        System.out.println("sum of digits ="+" "+sum);
    }
}

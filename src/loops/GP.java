package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, r = 3;
        for(int i = 1;i<=n;i++){
            System.out.println(a);
            a *= r;
        }
    }
}

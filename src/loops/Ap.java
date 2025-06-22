package loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 4,d =3;
        for(int i = 1;i<=n;i++){
            System.out.println(a);
            a += d;
        }
    }
}

package METHODS;

import java.util.Scanner;

public class oddnumbers {
    public static void oddNumbers(int a, int b){
        //ensure a is less than b
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        a = a+1;
        for(int i = a;i<b;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        oddNumbers(a,b);

    }
}

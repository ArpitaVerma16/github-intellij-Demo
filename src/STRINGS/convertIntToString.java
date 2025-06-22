package STRINGS;
import java.util.*;
public class convertIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String s = ""+n;


        String s = Integer.toString(n);
     System.out.println(s);//string = 10
        System.out.println(s.length());//no of digits

    }
}

package STRINGS;
import java.util.*;
public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int left = 0,right = n-1;
        while(left<right){
            char ch = sb.charAt(left);
            char chh = sb.charAt(right);

            sb.setCharAt(left,chh);
            sb.setCharAt(right,ch);

            left++;
            right--;

        }

        System.out.println(sb);
    }
}

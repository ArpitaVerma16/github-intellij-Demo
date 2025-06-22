package STRINGS;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }else if(ch>='a'&& ch<='z'){
                ch = (char)(ch-32);
            }
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}

package STRINGS;
import java.util.*;

public class inputStringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.setCharAt(2,'g');
        System.out.println(sb);
    }
}

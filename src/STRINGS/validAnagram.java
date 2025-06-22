package STRINGS;
import java.util.*;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if(s.length()!=t.length()) System.out.println(false);
        char ch[] = s.toCharArray();
        char chh[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chh);

        for(int i = 0;i<ch.length;i++){
            if(ch[i]!= chh[i]) System.out.println(false);

        }
        System.out.println(true);

    }
}

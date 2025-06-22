package STRINGS;
import java.util.*;

public class mostnoofOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[26];
        //insert freq in array
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)ch -97;
            freq[idx]++;
        }
        //find max value
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<freq.length;i++){
           max = Math.max(max,freq[i]);
        }
        // if two hava same max value
        for(int i = 0;i<freq.length;i++){
            if(freq[i]==max) {
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }

    }
}

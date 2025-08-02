package STRINGS;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // sorting string
        String s = "arpita";
        char[] ch = s.toCharArray();
        //print
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        //sort
        Arrays.sort(ch);

        for(char ele : ch){
            System.out.print(ele+" ");
        }


        // sorting stringBuilder
        StringBuilder sb = new StringBuilder("arpitaa");
        char chh[] = (sb.toString()).toCharArray();
        Arrays.sort(chh);
        for(char ele : chh){
            System.out.print(ele);
        }

    }
}

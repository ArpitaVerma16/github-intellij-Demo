import java.util.*;

public class countOccurencesOfAnagrams {
    public static void main(String[] args) {
        String str = "forxxotrfxdofr";
        String s = "for";
        int k = s.length();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        char[] chh = str.toCharArray();
        int i = 0,j= 0 , length = chh.length,count = 0;
        while(j<length){
            Arrays.sort(chh);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                for(int x=0;x<ch.length;x++){
                    if(ch[i]==chh[j]) count++;
                }
            }
        }
        System.out.println(count);
    }

}

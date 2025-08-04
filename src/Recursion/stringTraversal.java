package Recursion;

import org.w3c.dom.ls.LSOutput;

public class stringTraversal {
    static void traversal(String s,int idx,String ans){
        if(idx==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(idx)!='a') ans = ans+s.charAt(idx);
        traversal(s,idx+1,ans);
    }
    public static void main(String[] args) {
        String s = "adnaan";
        traversal(s,0," ");
    }
}

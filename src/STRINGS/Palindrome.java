package STRINGS;

public class Palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
//        StringBuilder t = new StringBuilder();
//        for(int k = 0;k<sb.length();k++){
//            t.setCharAt(k,sb.charAt(i));
//        }
        //check palindrome
        if(s.charAt(i)==sb.charAt(i)) System.out.println("Palindrome");
        else System.out.println("not a palindrome");
    }
}

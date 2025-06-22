package STRINGS;

public class reverseHalfString {
    public static void main(String[] args) {
        String s = "Arpita";
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length()/2-1;// other way from half to end
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }

}

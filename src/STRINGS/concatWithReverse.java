package STRINGS;

public class concatWithReverse {
    public static void main(String[] args) {
        String s = "Arpita";
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length()-1;// other way from half to end
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        String t = s.concat(sb.toString());
        System.out.println(t);
    }
}

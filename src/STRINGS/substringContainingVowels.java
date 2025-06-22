package STRINGS;

public class substringContainingVowels {
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "aeidou";
        int count = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                for (int j = i;j< s.length() && (isVowel(ch)==true) ; j++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

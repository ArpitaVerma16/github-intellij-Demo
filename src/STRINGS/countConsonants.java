package STRINGS;

public class countConsonants {
    public static boolean isConsonants(char ch){
        if(ch=='a'|| ch=='A') return true;
        if(ch=='e'|| ch=='E') return true;
        if(ch=='i'|| ch=='I') return true;
        if(ch=='o'|| ch=='O') return true;
        if(ch=='u'|| ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "ArpitaVerma";
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isConsonants(ch)!=true){
                count++;
            }
        }
        System.out.println(count);
    }
}

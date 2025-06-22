package STRINGS;

public class characterIntoInt {
    public static void main(String[] args) {
        String s = "Abhishek";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
           int  value = (int) ch;
            System.out.print(value+" ");
        }

    }
}

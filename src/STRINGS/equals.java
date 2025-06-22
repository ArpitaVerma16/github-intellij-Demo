package STRINGS;

public class equals {
    public static void main(String[] args) {
        String s = "abcde";
        String b = "abc";
//        System.out.println(s==b);//true because address are same
        b = b+"de";
        System.out.println(s==b);//false because address not same

        System.out.println(s.equals(b));//true

    }
}

package STRINGS;

public class stringBuilder {
    public static void main(String[] args) {
        String ss = "abc";
        StringBuilder sb = new StringBuilder(ss);//
        StringBuilder s = new StringBuilder("");//empty stringbuilder
        StringBuilder b = new StringBuilder(10);//
        System.out.println(b.length());//0
        System.out.println(sb.capacity());//19

    }
}

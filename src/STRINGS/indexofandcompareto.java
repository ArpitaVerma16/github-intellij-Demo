package STRINGS;

public class indexofandcompareto {
    public static void main(String[] args) {
        String a = "Arpita Verma";
        System.out.println(a.indexOf('a'));//5
        System.out.println(a.indexOf('z'));//-1
        System.out.println(a.lastIndexOf('a'));//11

        String x = "abc";
        String y = "dbc";
        System.out.println(x.compareTo(y));//-3

        String s = "I am an Engineer";
        System.out.println(s.contains("ine"));//true
        System.out.println(s.startsWith("I"));//true
        System.out.println(s.endsWith("er"));//true
    }
}

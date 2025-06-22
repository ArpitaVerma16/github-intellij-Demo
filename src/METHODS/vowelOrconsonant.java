package METHODS;

import java.util.Scanner;

public class vowelOrconsonant {
    public static void checkAlphabet(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch+" is a vowel");
                break;
            default: System.out.print(ch+" is a consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        checkAlphabet(ch);
    }
}

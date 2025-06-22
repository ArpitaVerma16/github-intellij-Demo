package STRINGS;

public class updateOddPositions {
    public static void main(String[] args) {
      String s = "Arpita";
      char ch[] = s.toCharArray();
      for(int i = 0;i<ch.length;i++){
          if(i%2!=0) ch[i] = '#';
      }
        System.out.println(ch);
    }
}

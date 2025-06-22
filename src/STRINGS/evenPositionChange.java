package STRINGS;

public class evenPositionChange {
    public static void main(String[] args) {
        String s = "Elephant";
        int n = s.length();
        String str ="";
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                str += 'a';
            }else{
                str +=  s.charAt(i);

            }
        }
        System.out.println(str);

    }
}

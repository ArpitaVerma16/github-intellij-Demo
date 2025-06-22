import java.util.*;

public class squareofnaturalnumbers {
    public static void squareOfNaturalNumbers(int n){
        for(int i = 1;i<=n;i++){
            System.out.println(i*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squareOfNaturalNumbers(n);

    }
}

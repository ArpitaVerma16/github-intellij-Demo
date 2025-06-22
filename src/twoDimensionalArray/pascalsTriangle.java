package twoDimensionalArray;
import java.util.*;
public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n; i++){
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
              if(j==0 || j==i)  l.add(1);
              else{
                  l.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
              }
            }
            ans.add(l);
        }
        //filling
//        for(int i = 2;i<n; i++){
//            for (int j = 1; j <= i-1; j++) {
//                ans.get(i).set(j, ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
//            }
//        }
        // getting element
        for(int i =0;i<ans.size();i++){
            List<Integer> x = ans.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}

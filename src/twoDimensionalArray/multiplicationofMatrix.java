package twoDimensionalArray;
import java.util.*;
public class multiplicationofMatrix {
    public static void print(int arr[][]){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,1,2}};
        int b[][] = {{1,3,4,1},{2,4,1,3},{5,6,7,8}};
        if(a[0].length != b.length){
            System.out.println("Multiplication not possible");
        }else{
            int ans[][] = new int[a.length][b[0].length];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        //logic
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            print(a);
            print(b);
            print(ans);
        }

    }
}

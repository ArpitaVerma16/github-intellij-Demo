package twoDimensionalArray;

import java.util.Scanner;

public class largestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        System.out.println("Enter Elements: ");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        //find largest
        int mx = Integer.MIN_VALUE;
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                if(arr[i][j]>mx){
                    mx = Math.max(mx,arr[i][j]);
                }
            }
        }
        System.out.println(mx);
    }
}

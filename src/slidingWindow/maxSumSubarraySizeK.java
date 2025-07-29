package slidingWindow;

import java.util.Scanner;

public class maxSumSubarraySizeK {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size: ");
        int k = sc.nextInt();
        int i = 0, j= 0, sum = 0;
        int mx = Integer.MIN_VALUE;
        while(j<n){
            sum += arr[j];
            if(j-i+1<k) j++;
            else if(j-i+1==k){
               mx = Math.max(mx,sum);
              sum -= arr[i];
              j++;
              i++;
            }
        }
        System.out.println(mx);
    }

}

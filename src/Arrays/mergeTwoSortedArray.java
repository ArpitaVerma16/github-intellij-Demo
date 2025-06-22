package Arrays;
import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m+n];
        for(int i = 0;i<m;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
        }
        int i = 0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k]= b[j];
                j++;
                k++;
            }
        }
        if(i==m){//take value from b only
            while(j>n){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==n){//take value from a only
            while(i>m){
                c[k] = a[i];
                i++;
                k++;
            }
        }
       for(int ele:c){
           System.out.println(c[k]+" ");
       }

    }
}

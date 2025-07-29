import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class firstNegativeinEveryWindowK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size: ");
        int k = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < i + k; j++) {
//                while (j < n) {
//                    if (arr[j] < 0) {
//                        System.out.println(arr[j]);
//                        break;
//                    } else if(arr[j]>0) {
//                        System.out.println("0");
//                        break;
//                    }
//                }
//            }
//        }
        int i = 0,j=0;
        ArrayList<Integer> l = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        while(j<n){
            if(arr[j]<0) dq.addLast(arr[j]);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                 if(!dq.isEmpty()){
                     l.add(dq.peekFirst());
                 }
                 if(!dq.isEmpty() && arr[i]== dq.peekFirst()){
                     dq.removeFirst();
                 }else if(dq.isEmpty()){
                     l.add(0);
                 }
                 i++;
                 j++;
            }

        }
        System.out.println("first negative in every window: ");
        for(int num: l){
            System.out.println(num+" ");
        }
    }
}

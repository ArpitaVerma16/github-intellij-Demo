import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(i);
                flag = true;
                break;
            }
            }
        if(!flag){
            System.out.println("-1");
        }
    }
}

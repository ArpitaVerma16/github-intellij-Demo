package BinarySearch;

public class lowerbound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int x = 25;
        int n = arr.length;
        int low = 0, high = n-1;
        int lb = n;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb,mid);
                high = mid -1;
            }else low = mid+1;
        }
        System.out.println("lower bound:"+" "+lb);
    }
}

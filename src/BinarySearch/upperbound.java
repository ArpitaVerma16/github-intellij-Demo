package BinarySearch;

public class upperbound {
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,40,50,60,70};
        int x = 30;
        int n = arr.length;
        int low = 0, high = n-1;
        int ub = n;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>x){
                ub = Math.min(ub,mid);
                high = mid -1;
            }else low = mid+1;
        }
        System.out.println("upper bound:"+" "+ub);
    }
}

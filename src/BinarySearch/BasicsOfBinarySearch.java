package BinarySearch;

public class BasicsOfBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,12,15,34,81,105,180,500,600};
        int target = 180;
        int n = arr.length;
        int start = 0, end = n-1;
        boolean flag = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] > target) end= mid-1;
            else if(arr[mid]<target) start = mid+1;
            else if(arr[mid]==target){
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.println("target found");
        else System.out.println("target not present");
    }
}

import java.util.*;

public class shallowanddeep {
    public static void main(String[] args) {
        int arr[] ={10,11,9,8,46,16};
        //shallow copy (changes in original array after changes in copy)
        int nums[]= arr;
        nums[0] = 70;
        System.out.println(arr[0]);//70

        // Deep copy
        int brr[] = Arrays.copyOf(arr,arr.length);
        brr[0] = 30;
        System.out.println(arr[0]);//no any changes in original array

        // method -2 of deep copy
        int crr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i] = arr[i];
        }
        crr[0] = 30;
        System.out.println(arr[0]);//no change in original array
     }
}

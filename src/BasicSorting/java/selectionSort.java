package BasicSorting.java;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,40};
        int n = arr.length;
//        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++) {
            int min_idx = i;
            for(int j = i+1;j<n;j++){
              if(arr[j]<arr[min_idx]){
                  min_idx = j;
              }
            }
            //swap arr[min_idx] and arr[i]
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

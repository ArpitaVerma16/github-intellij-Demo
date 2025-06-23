package BasicSorting.java;

public class Bubblesort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 2};
        int n = arr.length;
        //bubble sort-1
//        for(int x = 0;x<n-1;x++){//(n-1)passes
//            for(int i =0;i<n-1;i++){
//                if(arr[i]>arr[i+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }

        //bubble sort-2
//        for(int x = 0;x<n-1;x++){//(n-1)passes
//        for(int i =0;i<n-1-x;i++){
//            if(arr[i]>arr[i+1]) {int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//            }

        //optimized bubble sort
        for (int x = 0; x < n - 1; x++) {//(n-1)passes
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break;
        }
        print(arr);
    }
}

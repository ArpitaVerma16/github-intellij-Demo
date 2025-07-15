package BasicSorting.java;

public class insertionSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,50,4,10,2};
        int n = arr.length;
        print(arr);
      //  method -1
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j>=1; j--) {
//                if(arr[j]<arr[j-1]){//swap
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }else break;
//            }
//        }

        for (int i = 1; i < n; i++) {
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
       print(arr);
    }
}

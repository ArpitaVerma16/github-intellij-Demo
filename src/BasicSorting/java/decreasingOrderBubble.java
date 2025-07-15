package BasicSorting.java;

public class decreasingOrderBubble {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 4};
        int n = arr.length;
        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
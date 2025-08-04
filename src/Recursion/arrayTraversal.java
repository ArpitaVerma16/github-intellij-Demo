package Recursion;

public class arrayTraversal {
    static void traversal(int[] arr,int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        traversal(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        traversal(arr,0);
    }
}

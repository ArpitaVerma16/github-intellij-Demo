package Arrays;

public class sort0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1,0,1};
        int n = arr.length;


        //method-1
//        int noOfZeroes = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i]==0){
//                noOfZeroes++;
//            }
//        }
//        for(int i = 0;i<n;i++){
//            if(i<noOfZeroes) arr[i] = 0;
//            else arr[i] = 1;
//        }
//        for(int i = 0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }




        //Method-2
        int left = 0, right = n-1;
        while(left<=right){
            if(arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]==0) left++;
            if (arr[right]==1) right--;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

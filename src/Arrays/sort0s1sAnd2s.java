package Arrays;

public class sort0s1sAnd2s {
    public static void main(String[] args) {
        //Method-1
        int arr[] = {0,1,1,0,2,1,1,0,2};
        int n = arr.length;
//        int noOfZeroes = 0,noOfOnes = 0;
//        for(int i = 0;i<n;i++) {
//            if (arr[i] == 0) noOfZeroes++;
//            if (arr[i] == 1) noOfOnes++;
//        }
//        for(int i = 0;i<n;i++){
//            if(i<noOfZeroes) arr[i] = 0;
//            else if( i<noOfOnes+noOfZeroes) arr[i] = 1;
//            else arr[i] = 2;
//        }




        //Method-no-2

      int low = 0,mid = 0,high = n-1;
      while(mid<=high){
          if(arr[mid]==0){
              int temp = arr[low];
              arr[low] = arr[mid];
              arr[mid] = temp;
              low++;
              mid++;
          }
          else if(arr[mid]==1) mid++;
          else{
              int temp = arr[mid];
              arr[mid] = arr[high];
              arr[high] = temp;
              high--;
          }
      }

        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}

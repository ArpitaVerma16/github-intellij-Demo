package Arrays;

public class secondmaximum {
    public static void main(String[] args) {
        int arr[] = {10,18,2,5,6,8,90};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
//           if(arr[i]>max){
//               max = arr[i];
//           }
            max = Math.max(max,arr[i]);
        }
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=max)
          secondmax= Math.max(secondmax,arr[i]);
        }
        System.out.println(secondmax);
    }
}

package Arrays;

public class givenArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,5,4,6,9,10,55,88};
        boolean flag = true;
        for(int i = 0;i<arr.length-1;i++){
            if (arr[i+1]<arr[i]) {
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}

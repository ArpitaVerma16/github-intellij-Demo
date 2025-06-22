package Arrays;

public class multiplyelements {
    public static void main(String[] args) {
        int arr[] = {10,100,20,5,15};
        int mul = 1;
        for(int i = 0;i<arr.length;i++){
            mul = mul*arr[i];
        }
        System.out.println(mul);
    }
}

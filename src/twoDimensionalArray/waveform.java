package twoDimensionalArray;

public class waveform {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length, n = arr[0].length;
        // 2X3 original
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
        //waveform
//        for (int i = 0; i < n; i++) {
//            int a = 0, b = m-1;
//            if(i%2!=0){
//                while(a<=b) {
//                    int temp = arr[i][a];
//                    arr[i][a] = arr[i][b];
//                    arr[i][b] = temp;
//                    a++;
//                    b--;
//                }
//            }
//        }
        //print waveform
        //waveform second way
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
            }else{
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]);
                }
            }
        }
        //printing waveform
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}

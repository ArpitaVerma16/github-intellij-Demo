package twoDimensionalArray;

public class transpose {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{5,6,7},{10,8,9}};
        int m = arr.length, n = arr[0].length;
        // 2X3
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Transpose of a matrix (3x2)
        int transpose[][] = new int[n][m];
        for (int i = 0; i< n; i++) {
            for (int j = 0; j<m; j++) {
               transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
}

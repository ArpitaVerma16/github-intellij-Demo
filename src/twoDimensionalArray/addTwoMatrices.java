package twoDimensionalArray;

import java.util.Scanner;

public class addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int brr[][] = new int[2][2];
        System.out.println("Enter elements of arr: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of brr: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        //add matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(arr[i][j]+brr[i][j]+" ");

            }
            System.out.println();
        }

    }
}

package Recursion;

public class mazePath {
    static int maze(int r,int c,int m,int n){
        if(r==m || c == n)return 1;
        int rightWays = maze(r,c+1,m,n);
        int downWays = maze(r+1,c,m,n);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        System.out.println(maze(1,1,3,3));
    }
}

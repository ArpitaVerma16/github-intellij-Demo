package Recursion;

public class mazePath {
    static int maze(int r,int c,int m,int n){
        //1st Method
        if(r==m || c == n)return 1;
//        if(r==m && c == n)return 1;
//        if(r>m && c >n) return 0;
        int rightWays = maze(r,c+1,m,n);
        int downWays = maze(r+1,c,m,n);
        return rightWays + downWays;
    }
    // 2nd Method
    static int maze2(int m, int n){
     if(m==1 || n==1)return 1;
     int rightWays = maze2(m,n-1);
     int leftWays = maze2(m-1,n);
     return rightWays + leftWays;
    }
    public static void main(String[] args) {
        System.out.println(maze(1,1,3,3));
        System.out.println(maze2(3,3));
    }
}

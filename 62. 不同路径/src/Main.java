
public class Main {

    /**
     * dp
     * @param
     * @param
     * @return
     */
//    public int uniquePaths(int m, int n) {
//        int [][]dp = new int[m][n];
//
//        for (int i = 0; i < m; ++i){
//            dp[i][0] = 1;
//        }
//        for (int j = 0; j < n; ++j){
//            dp[0][j] = 1;
//        }
//
//        for (int i = 1; i < m; ++i){
//            for (int j = 1; j < n; ++j){
//                dp[i][j] = dp[i-1][j] + dp[i][j-1];
//            }
//        }
//        return dp[m-1][n-1];
//    }

    /**
     * math
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int a = m+n-2;
        int b = n-1;

        int res = 1;
        for (int i = 1; i <= b; ++i){
            res *= (a-b+i)/i;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

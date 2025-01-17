public class Rod_Cutting_Tabulation {
    public static int rodCutting(int length[], int price[], int rodLength) {
        int n = price.length;
        int dp[][] = new int[rodLength + 1][n + 1];
        for (int i = 0; i < dp.length; i++) { // 0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }

        for (int i = 1; i < rodLength + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int r = length[i - 1];
                if (r <= j) {
                    int in = dp[i][j - r] + price[i - 1];
                    int ex = dp[i - 1][j];
                    dp[i][j] = Math.max(in, ex);
                } else {
                    int ex = dp[i - 1][j];
                    dp[i][j] = ex;
                }
            }
        }
        return dp[rodLength][n];
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 90, 10, 17, 17, 20 };
        int rodLength = 8;
        System.out.println(rodCutting(length, price, rodLength));
    }
}
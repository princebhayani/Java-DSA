public class Coin_Change_Tabulation {
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) { // 0th col where sum = 0
            dp[i][0] = 1;
        }
        for (int j = 1; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int c = coins[i - 1]; // ith item val
                if (c <= j) { // valid
                    int includeCoin = dp[i][j - c];
                    int excludeCoin = dp[i - 1][j];
                    dp[i][j] = includeCoin + excludeCoin;
                } else { // invalid
                    int excludeCoin = dp[i - 1][j];
                    dp[i][j] = excludeCoin;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(coinChange(coins, sum));
    }
}

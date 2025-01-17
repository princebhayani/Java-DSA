public class Longest_Common_Substring_Tabulation {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        // initialization
        for (int i = 0; i < dp.length; i++) { //0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { //0th row
            dp[0][j] = 0;
        }
        int maxLength =0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {// same
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength=Math.max(maxLength,dp[i][j]);
                } else {// diff
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abecdg";
        System.out.println(lcs(str1, str2));
    }
}

import java.util.*;
public class Longest_Increasing_Subsequence_Tabulation {
    public static int lis(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int num : arr){
            s.add(num);
        }
        int arr2[] = new int[s.size()];
        Iterator<Integer> itr = s.iterator();
        int k =0;
        while(itr.hasNext()){
            arr2[k++] = itr.next();
        }
        Arrays.sort(arr2);
        
        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(arr[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int[] arr = { 50, 3, 10, 7, 40, 80 };
        System.out.println(lis(arr));
    }
}

public class max_sub_array_sum_1_brute_force {
    public static int maxSubArraySum(int arr[]) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int subTotal=0;
                for (int k = i; k < arr.length-j; k++) {
                    subTotal = subTotal+arr[k];
                    
                }
                // System.out.println(subTotal);
                if(subTotal>sum){
                    sum = subTotal;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int numbers[] ={1,-2,6,-1,3};
        System.out.println("max sum is : "+maxSubArraySum(numbers));
    }
    
}
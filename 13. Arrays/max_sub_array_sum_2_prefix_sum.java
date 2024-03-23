public class max_sub_array_sum_2_prefix_sum {
    public static int maxSubArraySum(int arr[]) {
        int sum =0;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end =j;
                int subTotal = start==0? prefix[end] : prefix[end] - prefix[start-1];
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

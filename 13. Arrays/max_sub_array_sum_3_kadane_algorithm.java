public class max_sub_array_sum_3_kadane_algorithm {
    public static void kadane(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;

        for(int i =0;i<numbers.length;i++){
            currentSum +=numbers[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("maximum subarray sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}

public class Question_2_15 {
    public static void sumOfRow2(int num[][]){
        int sum =0;
        for(int i =0 ;i<num[0].length;i++){
            sum+= num[1][i];
        }
        System.out.println("Sum of row 2  is : "+sum);
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sumOfRow2(nums);
    }
}

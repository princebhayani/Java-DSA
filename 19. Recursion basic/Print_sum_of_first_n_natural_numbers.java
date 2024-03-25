public class Print_sum_of_first_n_natural_numbers {
    public static int sumOfNaturalNum(int num){
        if(num == 1){
            return 1;
        }
        int sum = num;
        sum = sumOfNaturalNum(num-1)+sum;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNum(10));
    }
}

public class Find_factorial_of_n {
    public static int findFactorial(int num){
        int facto = num;
        if(num == 0 || num == 1){
            return 1;
        }
        facto = findFactorial(num-1)*facto;
        return facto;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}

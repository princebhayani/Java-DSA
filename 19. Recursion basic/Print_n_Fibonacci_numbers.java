public class Print_n_Fibonacci_numbers{
    public static int fibbo(int num){
        if(num == 0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        int fib =0;
        fib += fibbo(num-1)+fibbo(num-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibbo(25));
    }
}
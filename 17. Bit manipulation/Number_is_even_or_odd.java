public class Number_is_even_or_odd {
    public static void evenOdd(int num){
        if((num & 1) == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        evenOdd(7);
        evenOdd(56);
        evenOdd(11);
    }
}

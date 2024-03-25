public class Print_numbers_in_increasing_orders {
    public static void printNum(int num){
        if(num  ==0){
            return;
        }
        printNum(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        printNum(6);
    }
}

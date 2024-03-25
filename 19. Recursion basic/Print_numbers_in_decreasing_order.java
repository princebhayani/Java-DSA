public class Print_numbers_in_decreasing_order {
    public static int printNum(int num){
        if(num  ==0){
            return 0;
        }
        System.out.println(num);
        return printNum(num-1);
    }
    public static void main(String[] args) {
        printNum(6);
    }
}

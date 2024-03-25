public class Clear_range_of_bits {
    public static void clearRangeOfBits(int num,int i,int j){
        int a = -1<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        System.out.println("New Digit is : "+(bitMask&num));
    }
    public static void main(String[] args) {
        clearRangeOfBits(10, 2, 4);
    }
}

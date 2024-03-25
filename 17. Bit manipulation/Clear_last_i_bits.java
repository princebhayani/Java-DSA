public class Clear_last_i_bits {
    public static void clearLastIBits(int num,int i){
        int bitMask = -1<<i;
        System.out.println("New Digit is : "+(bitMask&num));
    }
    public static void main(String[] args) {
        clearLastIBits(15, 2);
    }
}

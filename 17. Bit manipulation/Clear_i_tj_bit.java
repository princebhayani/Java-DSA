public class Clear_i_tj_bit {
    public static void clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        System.out.println("ith bit is : "+(num&bitMask));
    }
    public static void main(String[] args) {
        clearIthBit(10, 1);
    }
}

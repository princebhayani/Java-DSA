public class Set_i_th_bit {
    public static void setIthBit(int num, int i){
        int bitMask = 1<<i;
        System.out.println("ith bit is : "+(num|bitMask));
    }
    public static void main(String[] args) {
        setIthBit(10, 2);
    }
}

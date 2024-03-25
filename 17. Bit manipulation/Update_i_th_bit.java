public class Update_i_th_bit {
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return(num&bitMask);
    }
    public static void updateIthBit(int num, int i,int newBit){
        num = clearIthBit(num, i);
        int bitMask = newBit<<i;
        System.out.println("Updated ith bit is : "+ (bitMask|num));
    }
    public static void main(String[] args) {
        updateIthBit(10, 2, 1);
    }
}

public class Get_i_th_bit {
    public static void getIthBit(int num,int x){
        int bitMask = (1<<x);
        if((num & bitMask) == 0){
            System.out.println("ith Bit is : 0");
        }else{
            System.out.println("ith Bit is : 1");
        }
    }
    public static void main(String[] args) {
        getIthBit(37,3);
    }
}

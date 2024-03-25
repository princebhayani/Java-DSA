public class Count_set_bit_in_a_number {
    public static void countSetBit(int num){
        int count = 0;
        while(num > 0){
            if((num&1) == 1){
                count++;
            }
            num = num>>1;
        }
        System.out.println("Number of set bit in NUmber is : "+count);
    }
    public static void main(String[] args) {
        countSetBit(10);
    }
}

public class Check_if_number_is_power_of_2_or_not {
    public static void checkPowerOf2(int num){
        int bitmask = num&(num-1);
        if(bitmask ==0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not of power of 2");
        }
    }
    public static void main(String[] args) {
        checkPowerOf2(8);
        checkPowerOf2(10);
    }
}

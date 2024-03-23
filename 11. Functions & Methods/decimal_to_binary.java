public class decimal_to_binary {

    public static void decToBin(int decNum){
        int binNum =0;
        int powOf10 = 0;
        while(decNum > 0){
            int rNum = decNum%2;
            binNum = (rNum*(int)Math.pow(10, powOf10)) + binNum;

            powOf10++;
            decNum=decNum/2;
        }
        System.out.println("binary number is "+binNum);
    }
    public static void main(String[] args) {
        decToBin(12);
    }
}

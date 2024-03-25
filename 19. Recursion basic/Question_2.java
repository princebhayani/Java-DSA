public class Question_2 {
    public static void convertString(int num){
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine"};

        if(num ==0){
            return;
        }
        int lastDigit = num%10;
        num =num/10;
        convertString(num);
        System.out.print(arr[lastDigit]+" ");
        
    }
    public static void main(String[] args) {
        convertString(2019);
        System.out.println();
        convertString(1947);
    }
}

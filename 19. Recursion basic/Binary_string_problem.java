public class Binary_string_problem {
    public static void printString(String sb,int n,int lastPlace){
        if(n ==0){
            System.out.println(sb);
            return;
        }
        printString(sb+"0", n-1,0);
        if(lastPlace ==0){
            printString(sb+"1", n-1,1);
        }
    }
    public static void main(String[] args) {
        printString("", 3,0);
    }
}
  
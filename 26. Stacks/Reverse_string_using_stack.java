import java.util.Stack;

public class Reverse_string_using_stack {
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        int i =0;
        while(i!= str.length()){
            s.push(str.charAt(i));
            i++;
        }
        while(i!=0){
            sb.append(s.pop());
            i--;
        }
        String result = sb.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "Prince";
        reverseString(str);
    }
}

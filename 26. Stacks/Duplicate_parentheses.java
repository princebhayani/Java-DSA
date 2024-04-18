import java.util.Stack;

public class Duplicate_parentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch==')'){
                int count =0;
                while(s.pop()!='('){
                    // s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                }
                // else{
                //     s.pop();//opening pair
                // }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str ="((a+b)+(c+d))";
        String str2 ="((a+b))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}

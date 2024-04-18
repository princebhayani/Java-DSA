import java.util.*;
public class Push_at_the_bottom_of_stack {
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        Stack<Integer> s1 = new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        s.push(data);
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.print(s.pop() +" ");
        }
        pushAtBottom(s, 0);
        while(!s.isEmpty()){
            System.out.print(s.pop() +" ");
        }
    }
}

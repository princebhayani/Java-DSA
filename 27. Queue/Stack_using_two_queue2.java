import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_two_queue2 {
    //push -O(n)
    //pop  -O(1)
    //peek  -O(1)
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            }else{
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }
        }
        public static int pop(){
            if(q1.isEmpty()){
                return q2.remove();
            }else{
                return q1.remove();
            }
        }

        public static int peek(){
            if(q1.isEmpty()){
                return q2.peek();
            }else{
                return q1.peek();
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
}

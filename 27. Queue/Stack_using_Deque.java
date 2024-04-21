import java.util.*;

public class Stack_using_Deque {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public int pop() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}

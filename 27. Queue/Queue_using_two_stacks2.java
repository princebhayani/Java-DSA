import java.util.Stack;

public class Queue_using_two_stacks2 {
    // add/push -O(1)
    // pop -O(n)
    // peek -O(n)
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);
        }

        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int x = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return x;
        }

        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int x = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return x;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}

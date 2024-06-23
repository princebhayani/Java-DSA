import java.util.Stack;

public class Queue_using_two_stacks {
     // add/push -O(n)
    // pop -O(1)
    // peek -O(1)
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.add(data);
            while (!s2.isEmpty()) {
                s1.add(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
    //     Queue q = new Queue();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);
    //     q.add(4);
    //     q.add(5);
    //     while (!q.isEmpty()) {
    //         System.out.print(q.peek() + " ");
    //         q.remove();
    //     }
    }
}

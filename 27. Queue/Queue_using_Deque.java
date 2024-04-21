import java.util.*;
public class Queue_using_Deque {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();
        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            if (dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

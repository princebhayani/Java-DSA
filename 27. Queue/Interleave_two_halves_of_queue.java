import java.util.*;

public class Interleave_two_halves_of_queue {
    public static void interLeave(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> fistHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            fistHalf.add(q.remove());
        }
        while (!fistHalf.isEmpty()) {
            q.add(fistHalf.remove());
            q.add(q.remove());
            
        }
    }
//valid for even numbers only
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps_implementation {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        public int compareTo(Student s2){
            return this.rank -s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3);
        pq1.add(6);
        pq1.add(5);
        pq1.add(1);

        while(!pq1.isEmpty()){
            System.out.print(pq1.remove()+" ");
        }


        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A",3));
        pq.add(new Student("B",6));
        pq.add(new Student("C",5));
        pq.add(new Student("D",1));


        while(!pq.isEmpty()){
            System.out.print(pq.peek().name+"->"+pq.peek().rank+" ");
            pq.remove();
        }
    }
}

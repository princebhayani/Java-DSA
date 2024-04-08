public class DoubleLL {
    
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data =data;
            this.next=null;
            this.prev =null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail=newNode;
            return;
        }
        newNode.next= head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev =tail;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head =tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev =null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head =tail=null;
            size--;
            return val;
        }
        int val= tail.data;
        tail = tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node nextNode;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            curr.prev = nextNode;
            prev =curr;
            curr = nextNode;
        }
        head =prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.print();
        System.out.println(size);
        dll.removeLast();
        dll.print();
        System.out.println(size);
        dll.reverse();
        dll.print();
    }
}

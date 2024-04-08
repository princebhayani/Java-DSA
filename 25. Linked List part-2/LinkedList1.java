public class LinkedList1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) { // or we can write head == null
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
    }

    public void removeLastNth(int n) {
        Node start = head;
        int sz = 0;
        while (start != null) {
            start = start.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        Node curr = head;
        int i = 1;
        while (i < sz - n) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean check = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                check = true;
                break;
            }
        }
        if (check == false) {
            return;
        }
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public Node getMid(Node head) { // if two mid this give us 1st mid 
        Node slow = head;
        Node fast = head.next; // if we use head only so we get 2nd mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newRight = mergeSort(head);
        Node newLeft = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        Node slow =head;
        Node fast = head.next;
        while(fast != null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;
        //2nd half rev
        Node curr = mid.next;
        mid.next =null;
        Node prev = null;
        Node nextNode;
        while(curr != null){
            nextNode = curr.next;
            curr.next =prev;
            prev = curr;
            curr = nextNode;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left != null && right != null){
            nextL=left.next;
            left.next = right;
            nextR = right.next;
            right.next =nextL;
            left = nextL;
            right =nextR;
        }
    }
    public static void main(String[] args) {
        // LinkedList1 ll = new LinkedList1();
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addLast(5);
        // ll.addFirst(1);
        // ll.add(6, 2);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // ll.addFirst(20);
        // ll.addFirst(30);
        // ll.addLast(50);
        // ll.addFirst(10);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(789534));
        // ll.reverse();
        // ll.print();
        // ll.removeLastNth(1);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(3);
        // head.next = new Node(35);
        // Node temp = new Node(45);
        // head.next.next = temp;
        // head.next.next.next = new Node(32);
        // head.next.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        LinkedList1 ll = new LinkedList1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        // ll.head =ll.mergeSort(ll.head);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
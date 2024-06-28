
public class Transform_to_Sum_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = sumTree(root.left);
        int rightChild = sumTree(root.right);
        int rootData = root.data;
        int leftData = root.left==null?0: root.left.data;
        int rightData = root.right==null?0: root.right.data;
        root.data = leftChild + rightChild + leftData  + rightData;
        return rootData;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        sumTree(root);
        System.out.println(root.data);
    }
}

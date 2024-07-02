import java.util.ArrayList;

public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
        }
    }
    public static void preOrder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static void getInOrder(Node root,ArrayList<Integer> inOrder){
        if(root == null){
            return ;
        }
        getInOrder(root.left, inOrder);
        inOrder.add(root.data);
        getInOrder(root.right, inOrder);
    }
    public static Node createBST(ArrayList<Integer> inOrder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root = new Node(inOrder.get(mid));
        root.left = createBST(inOrder, st, mid-1);
        root.right = createBST(inOrder, mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);
        root =createBST(inOrder, 0, inOrder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        // int arr[] ={3,5,6,8,10,11,12};
        // Node root= createBST(arr, 0, arr.length-1);
        // preOrder(root);

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left= new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right =new Node(11);
        root.right.right.right =new Node(12);

        preOrder(balancedBST(root));
    }
}

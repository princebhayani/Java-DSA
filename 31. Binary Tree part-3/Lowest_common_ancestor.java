import java.util.ArrayList;

public class Lowest_common_ancestor {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node lca2(Node root,int n1,int n2){
        if(root == null ||root.data == n1 || root.data ==n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }
    public static int lcaDis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDistance = lcaDis(root.left, n);
        int rightDistance = lcaDis(root.right, n);

        if(leftDistance ==-1 && rightDistance ==-1){
            return -1;
        }else if(leftDistance ==-1){
            return rightDistance+1;
        }else{
            return leftDistance+1;
        }



    }
    public static int minDistance(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int dis1 = lcaDis(lca,n1);
        int dis2 = lcaDis(lca,n2);
        return dis1+dis2;
    }

    public static int kAncestor(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDis = kAncestor(root.left, n, k);
        int rightDis = kAncestor(root.right, n, k);
        if(leftDis ==-1 && rightDis ==-1){
            return -1;
        }
        int max =Math.max(leftDis, rightDis);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(lca2(root, 4, 7).data);
        // System.out.println(minDistance(root, 4, 7));
        int n =5,k=2;
        kAncestor(root, n, k);
    }
}

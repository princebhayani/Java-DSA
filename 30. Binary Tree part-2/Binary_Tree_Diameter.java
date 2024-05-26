public class Binary_Tree_Diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //approach 1
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int leftDiameter = diameter1(root.left);
        int rightDiameter = diameter1(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight+rightHeight+1;
        return Math.max(selfDiameter,Math.min(rightDiameter, leftDiameter));
    }

    //Approach 2
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam =diam;
            this.ht =ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max((Math.max(leftInfo.diam, rightInfo.diam)), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1  ;
        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);
        System.out.println(height(root));
        System.out.println(diameter(root).diam);
    }
}

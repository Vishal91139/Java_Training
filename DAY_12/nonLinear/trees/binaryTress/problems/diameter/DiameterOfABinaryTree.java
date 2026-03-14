package DAY_12.nonLinear.trees.binaryTress.problems.diameter;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class DiameterOfABinaryTree {
    static int diameter = 0;
    static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left+right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        height(root);
        System.out.println("Diameter of the tree: "+ diameter);
    }
}

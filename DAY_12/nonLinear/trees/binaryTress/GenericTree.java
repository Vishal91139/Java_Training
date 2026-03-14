package DAY_12.nonLinear.trees.binaryTress;

public class GenericTree<X> {
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data = data;
        this.left = this.right = null;
    }

    void preOrder(){
        System.out.print(this.data+" ");
        if(this.left != null) this.left.preOrder();
        if(this.right != null) this.right.preOrder();
    }

    void inOrder(){
        if(this.left != null) this.left.inOrder();
        System.out.print(this.data+" ");
        if(this.right != null) this.right.inOrder();
    }

    void postOrder(){
        if(this.left != null) this.left.postOrder();
        if(this.right != null) this.right.postOrder();
        System.out.print(this.data+" ");
    }

    public static void main(String[] args) {
        // This is a tree of integers
        GenericTree<Integer> integerRoot = new GenericTree<>(1);
        integerRoot.left = new GenericTree<>(2);
        integerRoot.right = new GenericTree<>(3);
        System.out.print("PreOrder Integer tree: ");
        integerRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Integer tree: ");
        integerRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Integer tree: ");
        integerRoot.postOrder();
        System.out.println();

        // this is a tree of floats
        GenericTree<Float> floatRoot = new GenericTree<>(1.2f);
        floatRoot.left = new GenericTree<>(2.4f);
        floatRoot.right = new GenericTree<>(4.6f);
        System.out.print("PreOrder Float tree: ");
        floatRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Float tree: ");
        floatRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Float tree: ");
        floatRoot.postOrder();
        System.out.println();
        
        // this is a tree of boolean
        GenericTree<Boolean> booleanRoot = new GenericTree<>(true);
        booleanRoot.left = new GenericTree<>(false);
        booleanRoot.right = new GenericTree<>(true);
        System.out.print("PreOrder Boolean tree: ");
        booleanRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Boolean tree: ");
        booleanRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Boolean tree: ");
        booleanRoot.postOrder();
        System.out.println();
    }
}

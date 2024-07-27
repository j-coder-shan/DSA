public class binaryTree {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    binaryTree(){
        root = null;
    }
    public void insert(int data){
        root = insertRec(root, data);
    }
    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void preOrder(){
        preOrderRec(root);
    }
    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(STR."\{root.data} ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(STR."\{root.data} ");
            inOrderRec(root.right);
        }
    }
    public void postOrder(){
        postOrderRec(root);
    }
    public void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(STR."\{root.data} ");
        }
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Preorder traversal:");
        tree.preOrder();
        System.out.println("\nInorder traversal:");
        tree.inOrder();
        System.out.println("\nPostorder traversal:");
        tree.postOrder();
    }
}

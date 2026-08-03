package Trees;

public class traversals {
    public static void preorder(Node root){
        if (root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);      // root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.print("Preorder of tree is : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder of tree is : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder of tree is : ");
        postorder(a);
    }
}


// if we have to print reverse of preorder, inorder, & postorder then swap left to right and right to left.
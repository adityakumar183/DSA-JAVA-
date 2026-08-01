package Trees;

public class sizeOfBinaryTree {
    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int levels(Node root) {
        if (root == null) return 0;
        int level = 1 + Math.max(levels(root.left), levels(root.right));
        return level;
    }

    public static void main(String[] args) {
        Node a = new Node(1);   //  a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g;
        e.right = h;

        System.out.println("Size of Binary tree is = " + size(a));
        int level = levels(a);
        System.out.println("Levels of Binary tree is = " + level);
        System.out.println("Height of Binary tree is = "+ (level-1));
    }
}

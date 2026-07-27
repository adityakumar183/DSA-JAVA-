package Trees;
/*
// Tree is a hierarchical data structure.
// Traversing in a tree is done by depth first search and breadth first search algorithm.
// Tree has no loop and no circuit.
// Tree has no self loop.
// Types of tree:-
      1. Generic tree :- any node in a genric tree can have any no. of child nodes.
      2. Binary tree :- any node can have 0, 1, 2 child node.
      3. Binary Search tree :- left side:- smaller ele ,  right side:- greater ele.
      4. AVL tree :- self balance binary search tree.

 */
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){      // constructor
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);   //  a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println(b.val);         //4
        System.out.println(a.left.val);   // 4

        a.left.right.val = 96;  // e.val = 96
        System.out.println(e.val);               // 96
        System.out.println(a.left.right.val);    // 96

    }
}

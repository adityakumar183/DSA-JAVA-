package Linkedlist;

public class assignment_01 {

    /*
    Q1. In a singly linked list, deletion of data requires modification of how many pointers?
        1
        2
        3
        Depends upon the node being deleted.
  Ans:- In a singly linked list, deletion of a node generally requires modification of only one pointer

    Q2. Predict the output for linked list = 1->2->3->4->5:
        void traverse(Node head) {
        while (head != null && head.next != null) {
        System.out.print(head.data + " ");
        head = head.next.next;
            }
        }
       1 2 3 4 5
       1 3 5
       2 4
       1 3
  Ans:- - Start: head = 1
          Condition true (1 != null && 2 != null) → print 1
          Move head = head.next.next → head = 3
        - Now: head = 3
          Condition true (3 != null && 4 != null) → print 3
          Move head = head.next.next → head = 5
        - Now: head = 5
          Condition check: head != null (true), but head.next != null (false, since 5.next = null) → loop ends.

          so the answer is 1 3


     */
}

package Linkedlist;

public class palindromeDoublyLinkedList {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node tail = temp;
        while (head != tail && head.prev != tail) {
            if (head.val != tail.val) return false;
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        System.out.println(isPalindrome(head));
    }
}

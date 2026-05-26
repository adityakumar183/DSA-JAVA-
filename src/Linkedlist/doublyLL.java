package Linkedlist;

public class doublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        // move this temp backward to the head
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtTail(Node head, int x){
        Node temp = head;
        // temp ko tail tail tak le kar jaate hai
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIdx(Node head, int idx, int x){
        Node s = head;
        for(int i=1;i<=idx-1;i++){
            s = s.next;
        }
        // s is at idx-1 position
        Node r = s.next;  // idx
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static Node deleteHead(Node head){
        if(head == null) return null;
        if(head.next == null) return null;

        Node newHead = head.next;   // move head forward
        newHead.prev = null;        // disconnect old head
        head.next = null;
        return newHead;
    }

    public static Node deleteTail(Node head){
        if(head == null) return null;
        if(head.next == null) return null;

        Node temp = head;
        // tail tak jao
        while(temp.next != null){
            temp = temp.next;
        }
        // ab temp tail par hai
        Node newTail = temp.prev;
        newTail.next = null;
        temp.prev = null;
        return head;
    }

    public static Node deleteAtIdx(Node head, int idx){
        if(head == null) return null;
        if(idx == 0){
            return deleteHead(head);
        }

        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        // temp ab idx position par hai
        Node prevNode = temp.prev;
        Node nextNode = temp.next;

        prevNode.next = nextNode;
        if(nextNode != null){
            nextNode.prev = prevNode;
        }

        temp.prev = null;
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;  b.prev = a;
        b.next = c;  c.prev = b;
        c.next = d;  d.prev = c;
        d.next = e;  e.prev = d;
        e.next = null;

        display(a);
        displayReverse(e);
        displayRandom(c);

//        // value insert at head
//        Node newHead = insertAtHead(a,35);
//        display(newHead);
//
//        // value insert at tail
//        insertAtTail(a,90);
//        display(a);
//
//        // value insert at idx
//        insertAtIdx(a,3,56);
//        display(a);
//
//        // delete head (4)
//        Node afterDelete = deleteHead(a);
//        display(afterDelete);

        Node afterDeleteTail = deleteTail(a);
        display(afterDeleteTail);

        Node afterDeleteIdx = deleteAtIdx(a,2);
        display(afterDeleteIdx);
    }
}

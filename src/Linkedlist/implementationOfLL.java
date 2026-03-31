package Linkedlist;
class SLL{
    private Node head;
    private Node tail;
    private int size;

    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println("Size of Linked list is "+size);
    }
}

public class implementationOfLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();
        list.size();
        list.insertAtTail(60);
        list.display();
        list.size();
        list.insertAtHead(90);
        list.display();
        list.size();
    }
}

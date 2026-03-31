package Linkedlist;
class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
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
            tail.next = temp;
            tail = temp;
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
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
        System.out.println(list.size);
        list.insertAtEnd(60);
        list.display();
        System.out.println(list.size);
        list.size();
    }
}

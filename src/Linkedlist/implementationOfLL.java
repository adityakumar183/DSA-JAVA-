package Linkedlist;
class SLL{
    private Node head;
    Node tail;
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

    void insert(int idx, int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if(idx > size || idx < 0){
            System.out.println("Index out of range");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=0; i<idx-1; i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx){                            // T.C = O(n)
        if(idx >= size || idx < 0){
            System.out.println("Index out of range");
            return -1;
        }
        if(idx == size-1){
            return tail.val;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int val) throws Error{                            // T.C = O(n)
        if(idx >= size || idx < 0){
            throw new Error("Index out of range");
        }
        if(idx == size-1){
            tail.val = val;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.val = val;
    }

    void deleteAtHead() throws Error{
        if(head == null){
            throw new Error("list is empty");
        }
        head = head.next;
        size--;
    }

    void delete(int idx){
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(idx<0 || idx>=size){
            throw new Error("Index out of range");
        }
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        if(temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
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
        list.insert(1,100);
        list.display();
        list.insert(8,70);
        list.insert(9,80);
        list.display();
        System.out.println(list.get(2));
        list.set(2,70);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(2);
        list.display();
        list.delete(7);
        list.display();
        System.out.println(list.tail.val);
        list.size();
    }
}


/*
 when we have tail :-
    time complexity O(1)
    space complexity O(1)

    if not then,
    time complexity O(n)
 */

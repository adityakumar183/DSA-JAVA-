package Stacks;

public class linkedListImplementation {
    public static class Node {   // user defined data type
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack{   // user defied data structure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(Node h){   // helper function for printing in correct order
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();  // 4
        st.push(5);
        st.display();  // 4 5
        st.push(1);
        st.display();   // 4 5 1
        System.out.println(st.size());  // 3
        st.pop();
        st.display();   // 4 5
        System.out.println(st.size());  // 2
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();   // 4 5 6 7 8
        System.out.println(st.peek());  // 8
    }
}



/*
   Advantage :-
        1. Size  -> unlimited size

   Disadvantages :-
        1. size ->  two data members
        2. Display -> reverse -> space complexity O(n)
 */
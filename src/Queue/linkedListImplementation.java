package Queue;

public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        // add val in queue:-
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // peek val in queue:-
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        // remove val from queue:-
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        // display the queue:-
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        // built function:-
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());
    }
}



/*
        Advantage of LinkedList Implementation:-
        1. Unlimited size
        2. LinkedList works as a Queue

        Disadvantage of LinkedList Implementation:-
        1. size -> LL has two member
           (if we know that we have to insert only 100 elements than this implementation is called as disadvantage.)
 */
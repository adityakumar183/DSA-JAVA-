package Queue;

public class arrayImplementation {
    public static class queueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];

        // add val in queue:-
        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1){
                front = rear = 0;
                arr[0] = val;
            }
            else {
                arr[++rear] = val;
            }
            size++;
        }

        // remove or pop val from queue:-
        public int remove() {
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;       // other way is "return arr[f-1];"    no need to calculate x;
        }

        // peek val in queue:-
        public int peek() {
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // built empty function:-
        public boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }

        // display the queue:-
        public void display() {
            if(size == 0){
                System.out.println("Queue is empty");
            }
            else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}

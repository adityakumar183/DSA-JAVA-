package Queue;

public class circularQueue {
    public static class CircularQA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        // add element in queue:-
        public void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        // remove element from queue:-
        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }
            else{
                int val = arr[front];
                if(front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        // access element from queue:-
        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty");
            }
            else return arr[front];
        }

        // built function:-
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

        // display queue:-
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front <= rear){
                    for(int i = front; i <= rear; i++){
                        System.out.print(arr[i] + " ");
                     }
            }
            else{
                for(int i = front; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0; i <= rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        CircularQA q = new CircularQA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();  // 1 2 3 4 5
        q.remove();
        q.display();  // 2 3 4 5
        q.add(6);
        q.display();  // 6 2 3 4 5  -> 2 3 4 5 6
        System.out.println(q.isEmpty());


        // we can access the array using "q"
        for(int i = 0; i< q.arr.length; i++){
            System.out.print(q.arr[i] + " ");     // 6 2 3 4 5
        }
    }
}

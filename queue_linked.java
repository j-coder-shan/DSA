public class queue_linked {
    static class Node{
        int data;
        Node next;
    }
    Node front, rear;
    int count, size;
    queue_linked(int maxSize){
        size = maxSize;
        front = rear = null;
        count = 0;
    }
    private boolean isQueueEmpty() {
        return count == 0;
    }

    private boolean isQueueFull() {
        return count == size;
    }

    public void enQueue(int value){
        if (isQueueFull()){
            System.out.println("Queue is full!");
        }
        else {
            System.out.println(STR."Inserting value: \{value}");
            Node oldRear = rear;
            rear = new Node();
            rear.data  = value;
            rear.next = null;
            if (isQueueEmpty()){
                front = rear;
            }
            else {
                oldRear.next = rear;
            }
            count++;
        }
    }
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Queue is empty!");
        }
        else {
            System.out.println(STR."Removing value: \{front.data}");
            front = front.next;
            count--;
        }
    }
    public void display(){
        System.out.println("Elements in the queue:");
        Node current = front;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        queue_linked queue = new queue_linked(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.display();
        queue.enQueue(60);
        queue.enQueue(70);
        queue.display();
    }
}

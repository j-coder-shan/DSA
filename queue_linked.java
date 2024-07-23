public class queue_linked {
    class Node{
        int data;
        Node next;
    }
    Node front, rear;
    int count, size;
    queue_linked(int maxSize){
        size = maxSize;
        front = rear = null;
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
}

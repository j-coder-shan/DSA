public class queueCircular {
    int[] array;
    int front, rear, size, count;
    queueCircular(int maxSize){
        size = maxSize;
        array = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    private boolean isQueueFull() {
        return count == size;
    }
    private boolean isQueueEmpty() {
        return count == 0;
    }
    public void enQueue(int value){
        if(isQueueFull()){
            System.out.println("Queue is full!");
        }
        else {
            System.out.println(STR."Inserting value: \{value}");
            rear = (rear + 1) % size;
            array[rear] = value;
            count++;
        }
    }
    public void deQueue(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty!");
        }
        else {
            System.out.println(STR."Removing: \{array[front]}");
            front = (front + 1) % size;
            count--;
        }
    }
    public void display(){
        System.out.println("Elements in the circular queue:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        queueCircular queue = new queueCircular(5);
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

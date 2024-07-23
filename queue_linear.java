public class queue_linear {
    int[] array;
    int front, rear, size, count;

    queue_linear(int maxSize){
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
            array[++rear] = value;
            count++;
        }
    }

    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Queue is empty!");
        }
        else {
            System.out.println(STR."Removing value: \{array[front]}");
            front++;
            count--;
        }
    }
    public void display(){
        System.out.println("Queue elements are:");
        for (int i = front; i <= rear ; i++) {
            System.out.println(array[i]);
        }
    }


}

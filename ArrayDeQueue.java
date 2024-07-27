public class ArrayDeQueue {
    private final int[] arr;
    private int front;
    private int rear;
    private int size;
    private final int capacity;
    public ArrayDeQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public void insertFront(int element) {
        if (isFull()) {
            throw new IllegalStateException("DeQueue is full");
        }else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            arr[front] = element;
            size++;
        }
    }

    public void insertRear(int element) {
        if (isFull()) {
            throw new IllegalStateException("DeQueue is full");
        }else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1 + capacity) % capacity;
            }
            arr[rear] = element;
            size++;
        }
    }

    public int deleteFront() {
        if (isEmpty()) {
            throw new IllegalStateException("DeQueue is empty");
        }else {
            int element = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
            return element;
        }
    }

    public int deleteRear() {
        if (isEmpty()) {
            throw new IllegalStateException("DeQueue is empty");
        }else {
            int element = arr[rear];
            if (front == rear) {
                front = rear = -1; // DeQueue is now empty
            } else {
                rear = (rear - 1 + capacity) % capacity;
            }
            size--;
            return element;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("DeQueue is empty");
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            throw new IllegalStateException("DeQueue is empty");
        }
        return arr[rear];
    }
}

public class stack_array {
    int[] array;
    int top;
    int size;
    stack_array(int maxSize){
        size = maxSize;
        array = new int[size];
        top = -1;
    }
    private boolean isStackFull() {
        return top == size - 1;
    }
    private boolean isStackEmpty() {
        return top == -1;
    }
    public void  push(int value){
        if(isStackFull()){
            System.out.println("Stack is full");
            return;
        }
        else {
            System.out.println(STR."Inserting value: \{value}");
            array[++top] = value;
        }
    }
    public void pop(){
        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        else {
            System.out.println(STR."Removing value: \{array[top--]}");
        }
    }
    public void peek(){
        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        else {
            System.out.println(STR."Top value: \{array[top]}");
        }
    }
    public void display(){
        if(isStackEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        else {
            System.out.println("Stack elements are:");
            for(int i = 0; i <= top; i++){
                System.out.println(array[i]);
            }
        }
    }
}

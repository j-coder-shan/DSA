public class stack_linked {
    static class Node {
        int data;
        Node next;
        Node(int value){
            data = value;
            next = null;
        }
    }
    Node top;
    int size;
    stack_linked(){
        top = null;
        size = 0;
    }
    public void push(int value){
        System.out.println(STR."Inserting value: \{value}");

        Node node = new Node(value);
        node.data = value;
        node.next = top;
        top = node;
        size++;
    }
    public void pop(){
        if(size == 0){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(STR."Removing value: \{top.data}");
            top = top.next;
            size--;
        }
    }
    public void peek(){
        if(size == 0){
            System.out.println("Stack is empty");
            return;
        }
        else {
            System.out.println(STR."Top value: \{top.data}");
        }
    }

}


public class doubly_linked_list {
    static class Node{
        int data;
        Node next, prev;
    }
    Node head;
    int count;
    doubly_linked_list(){
        head = null;
        count = 0;
    }
    public boolean isListEmpty(){
        return count == 0;
    }
    public int listSize(){
        return count;
    }
    public void insertLast(int value){
        System.out.println(STR."Inserting last: \{value}");
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        newNode.prev = null;
        if(head == null){
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        count++;
    }
    public void insertList(int position, int value){
        if(position < 0 || position >= listSize()){
            System.out.println("Entered position is out of bound!");
        }else {
            System.out.println(STR."Inserting value: \{value} at index \{position}");
            Node newNode = new Node();
            newNode.data = value;
            newNode.prev = null;
            if(position == 0){
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            else {
                Node current = head;
                for (int i = 0; i < position - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                newNode.prev = current;
                current.next = newNode;
                if(newNode.next != null){
                    newNode.next.prev = newNode;
                }
            }
            count++;
        }
    }
    public void deleteList(int position){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else if (position < 0 || position >= listSize()) {
            System.out.println("Entered position is out of bound!");
        } else {
            if(position == 0){
                System.out.println(STR."Deleting value: \{head.data} at index \{position}");
                head = head.next;
                head.prev = null;
            }
            else {
                Node current = head;
                for (int i = 0; i < position - 1; i++) {
                    current = current.next;
                }
                System.out.println(STR."Deleting value: \{current.next.data} at index \{position}");
                current.next = current.next.next;
                if(current.next != null){
                    current.next.prev = current;
                }
            }
            count--;
        }
    }
    public void display(){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else {
            Node current = head;
            System.out.println("List: ");
            while (current != null){
                System.out.print(STR."\{current.data} ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doubly_linked_list dll = new doubly_linked_list();
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.insertLast(50);
        dll.display();
        dll.insertList(2, 25);
        dll.display();
        dll.deleteList(3);
        dll.display();
    }
}

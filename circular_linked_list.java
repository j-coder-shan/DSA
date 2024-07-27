public class circular_linked_list {
    class Node{
        int data;
        Node next;
    }
    Node tail;
    int count;
    circular_linked_list(){
        tail = null;
        count = 0;
    }
    public boolean isListEmpty(){
        return count == 0;
    }
    public int listSize(){
        return count;
    }
    public void insertLast(int value){
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        System.out.println("Inserting last: "+value);
        if(isListEmpty()){
            tail = temp;
            tail.next = tail;
        }
        else{
            temp.next = tail.next;
            tail.next = temp;
            tail = temp;
        }
        count++;
    }
    public void insertList(int position, int value){
        if(position < 0 || position >= listSize()){
            System.out.println("Entered position is out of bound!");
        }else {
            System.out.println("Inserting value: "+value+" at index "+position);
            Node temp = new Node();
            temp.data = value;
            temp.next = null;

            Node current = tail.next;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            count++;
        }
    }
    public void deleteList(int position){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else if (position < 0 || position >= listSize()) {
            System.out.println("Entered position is out of bound!");
        } else {
            Node current = tail.next;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            System.out.println("Deleting value: "+current.next.data+" at index "+position);
            current.next = current.next.next;
            count--;
        }
    }
    public void display(){
        if(isListEmpty()){
            System.out.println("List is empty!");
        } else {
            System.out.println("Elements in the circular linked list:");
            Node current = tail.next;
            do {
                System.out.print(STR."\{current.data} ");
                current = current.next;
            } while (current != tail.next);
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        circular_linked_list cll = new circular_linked_list();
        cll.insertLast(10);
        cll.insertLast(20);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.insertList(2, 25);
        cll.display();
        cll.deleteList(2);
        cll.display();
    }
}

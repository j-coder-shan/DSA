public class listLinked {
    class Node{
        int data;
        Node next;
    }
    Node head;
    int count;
    listLinked(){
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
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        System.out.println(STR."Inserting last: \{value}");
        if(isListEmpty()){
            head = temp;
        }
        else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
        count++;
    }
    public void insertList(int position, int value){
        if(position < 0 || position >= listSize()){
            System.out.println("Entered position is out of bound!");
        }else {
            System.out.println(STR."Inserting value: \{value} at index \{position}");
            Node temp = new Node();
            temp.data = value;
            temp.next = null;

            Node current = head;
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
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            System.out.println(STR."Deleting value: \{current.next.data} at index \{position}");
            current.next = current.next.next;
            count--;
        }
    }
    public void traverseList(){
        if(isListEmpty()){
            System.out.println("List is empty!");
        }else {
            System.out.println("Elements in the linked list:");
            Node current = head;
            while (current != null){
                System.out.print(STR."\{current.data} ");
                current = current.next;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        listLinked list = new listLinked();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.traverseList();
        list.insertList(2, 25);
        list.traverseList();
        list.deleteList(3);
        list.traverseList();
    }
}

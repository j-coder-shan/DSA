public class insertionSortLinked {
    class Node{
        int data;
        Node next;
    }
    Node head;
    static Node sorted;
    int count;
    String name;
    insertionSortLinked(){
        head = null;
        count = 0;
    }
    public boolean isListEmpty(){
        return count == 0;
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
    public static void printList(insertionSortLinked list, String name){
        System.out.println(STR."\{name}list:");
        Node current = list.head;
        while (current != null){
            System.out.print(STR."\{current.data} ");
            current = current.next;
        }
        System.out.println(" ");
    }
    public static void sort(insertionSortLinked list){
        sorted = null;
        Node current = list.head;
        while (current != null){
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        list.head = sorted;
        printList(list, "Sorted ");
    }

    private static void sortedInsert(Node node) {
        if(sorted == null || sorted.data >= node.data){
            node.next = sorted;
            sorted = node;
        }
        else {
            Node current = sorted;
            while (current.next != null && current.next.data < node.data){
                current = current.next;
            }
            node.next = current.next;
            current.next = node;

        }
    }

    public static void main(String[] args) {
        insertionSortLinked list = new insertionSortLinked();
        list.insertLast(25);
        list.insertLast(812);
        list.insertLast(467);
        list.insertLast(238);
        list.insertLast(67);
        list.insertLast(55);
        list.insertLast(12);
        printList(list, "Current ");
        sort(list);



    }
}

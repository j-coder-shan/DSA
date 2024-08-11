import java.util.Scanner;

public class heapSort {
    static Scanner scanner = new Scanner(System.in);
    static int[] list;
    static String name;
    private static void insertList() {
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();
        list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(STR."Enter no at index \{i}");
            int no = scanner.nextInt();
            list[i] = no;
        }
        name = "Current list:";
        printList(list, name);
    }

    private static void printList(int[] list, String name) {
        System.out.println(name);
        for( int j : list){
            System.out.print(STR."\{j} ");
        }
        System.out.println(" ");
    }
    public static void sort(){
        int len = list.length;
        for (int i = len / 2 - 1; i >= 0 ; i--) {
            insertHeap(len, i);
        }

        // Move current root element to end
        for (int i = len -1; i >= 0; i--){
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            insertHeap(i, 0);
        }
        name = "Sorted list:";
        printList(list, name);
    }
    private static void insertHeap(int len, int i) {
        int largest = i;  // root
        int left = i * 2 + 1;  // left child
        int right = i * 2 + 2;  // right child

        if (left < len && list[left] > list[largest]){
            largest = left;
        }
        if (right < len && list[right] > list[largest]){
            largest = right;
        }
        if (largest != i){
            int swap = list[largest];
            list[largest] = list[i];
            list[i] = swap;
            insertHeap(len, largest);
        }
    }

    public static void main(String[] args) {
        insertList();
        sort();
    }
}

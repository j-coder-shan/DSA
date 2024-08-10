import java.util.Scanner;

public class selectionSort {
    int[] list;
    String name;
    public void insertList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size = scanner.nextInt();
        list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(STR."Enter the number \{i} ");
            int no = scanner.nextInt();
            list[i] = no;
        }
        name = "Current ";
        printList(list, name);
    }
    private void printList(int[] list, String name) {
        System.out.println(STR."\{name}list:");
        for (int j : list){
            System.out.print(STR."\{j} ");
        }
    }
    private void sort(){
        for (int i = list.length - 1; i >= 0 ; i--) {
            int maxIndex = getMaxIndex(i);
            int temp = list[maxIndex];
            list[maxIndex] = list[i];
            list[i] = temp;
        }
        name = "\nSorted ";
        printList(list, name);
    }

    private int getMaxIndex(int maxIndex) {
        int index = maxIndex;
        for (int i = index; i >= 0 ; i--) {
            if (list[index] < list[i]){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        selectionSort list = new selectionSort();
        list.insertList();
        list.sort();
    }
}

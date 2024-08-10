import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int[] list;
    private static void insertList() {
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();
        list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(STR."Enter no at index \{i}");
            int no = scanner.nextInt();
            list[i] = no;
        }
        name = "Current ";
        printList(name);
    }
    private static void printList(String listName){
        System.out.println(STR."\{listName} list:");
        for (int j : list){
            System.out.print(STR."\{j} ");
        }
        System.out.println(" ");
    }
    private static void sortedList() {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            while (j > 0){
                if (list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
                j--;
            }
        }
        name = "Sorted ";
        printList(name);
    }

    public static void main(String[] args) {
        insertList();
        sortedList();
    }


}

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
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
        name = "Sorted list:";
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
        int l = list.length;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < (l - i); j++) {
                if (list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        name = "Sorted list:";
        printList(list, name);
    }

    public static void main(String[] args) {
        insertList();
        sort();
    }
}

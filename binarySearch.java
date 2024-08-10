import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    static Scanner scan = new Scanner(System.in);
    static int[] list;
    private static void insertList() {
        System.out.println("Enter the size of the list:");
        int size = scan.nextInt();
        list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(STR."Enter the value at index \{i}:");
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        printList(list);
    }
    private static void printList(int[] list) {
        for (int j : list) {
            System.out.print(STR."\{j} ");
        }
        System.out.println(" ");
    }
    private static void search(){
        System.out.println("Enter the number to search:");
        int no = scan.nextInt();
        if(no > list[list.length - 1]) {
            System.out.println(STR."Entered number, \{no} is not in the list.");
        }else {
            int low = 0;
            int high = list.length - 1;

            while (low <= high){
                int mid = (low + high) / 2;
                if(no < list[mid]){
                    high = mid - 1;
                } else if (no > list[mid]) {
                    low = mid + 1;
                }else {
                    System.out.println(STR."Number \{no} found at index \{mid}.");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        insertList();
        search();
    }

}

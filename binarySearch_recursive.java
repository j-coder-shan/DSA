import java.util.Arrays;
import java.util.Scanner;

public class binarySearch_recursive {
    static Scanner scanner = new Scanner(System.in);
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
        Arrays.sort(list);
        System.out.println("Sorted list:");
        printList(list);
    }

    private static void printList(int[] list) {
        for( int j : list){
            System.out.print(STR."\{j} ");
        }
        System.out.println(" ");
    }
    private static void search(){
        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();
        recursive(target, 0, list.length - 1);


    }

    private static void recursive(int target, int min, int max) {
        if(target > list[list.length - 1]){
            System.out.println(STR."Entered number, \{target} is not in the list.");
        }else {
            int mid = (min + max)/2;
            if (list[mid] > target){
                recursive(target, min, mid - 1);
            } else if (list[mid] < target) {
                recursive(target, mid + 1, max);
            }else {
                System.out.println(STR."The number \{target} is at index \{mid}.");
            }
        }
    }
    public static void main(String[] args) {
        insertList();
        search();
    }


}

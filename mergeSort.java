import java.util.Scanner;

public class mergeSort {
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
        mergeSort(list);
    }

    private static void printList(int[] list, String name) {
        System.out.println(name);
        for( int j : list){
            System.out.print(STR."\{j} ");
        }
        System.out.println(" ");
    }
    public static void mergeSort(int[] list){
        int len = list.length;
        if (len < 2){
            return;
        }
        int mid = len / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[len - mid];

        for(int i = 0; i  < len; i++){
            if(i < mid){
                leftArray[i] = list[i];
            }else {
                rightArray[i - mid] = list[i];
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, list);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] list) {
        int leftLen = leftArray.length;
        int rightLen = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen){
            if (leftArray[i] <= rightArray[j]){
                list[k++] = leftArray[i++];
            }else {
                list[k++] = rightArray[j++];
            }
        }
        while (i < leftLen){
            list[k++] = leftArray[i++];
        }
        while (j < rightLen){
            list[k++] = rightArray[j++];
        }
        name = "Sorted list:";
        printList(list, name);
    }
    public static void main(String[] args) {
        insertList();

    }
}

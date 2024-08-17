public class quickSort {
    public void sort(int start, int end, int[] list) {
        if (start < end) {
            int partitionIndex = partition(start, end, list);
            sort(start, partitionIndex - 1, list);
            sort(partitionIndex + 1, end, list);
        }
    }

    private int partition(int start, int end, int[] list) {
        int pivot = list[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (list[j] < pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i + 1];
        list[i + 1] = list[end];
        list[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 75, 65, 22, 44, 100, 95};
        int start = 0;
        int end = list.length - 1;
        quickSort Sort = new quickSort();
        Sort.sort(start, end, list);
        for (int num : list) {
            System.out.print(STR."\{num} ");
        }
    }
}
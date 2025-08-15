public class RecursiveBubbleSort {

    public static void RecursiveBubbleSortfn(int[] arr, int i) {
        if (i >= 0) {
            sort(arr, i, 0);
            RecursiveBubbleSortfn(arr, i - 1);

        }
        return;

    }

    public static void sort(int[] arr, int i, int j) {
        if (j < i) {
            if (arr[j] > arr[j + 1])
                swap(arr, j, j + 1);
            sort(arr, i, j + 1);
        }
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}

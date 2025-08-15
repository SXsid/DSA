public class RecursiveInserionSort {
    // i go from 1 to arr.lenth
    public static void Recursive(int[] arr, int i) {
        if (i >= arr.length)
            return;
        int insertionValue = arr[i];
        int insertionIndex = i;
        sort(arr, i - 1, insertionValue, insertionIndex);
        Recursive(arr, i + 1);
    }

    public static void sort(int[] arr, int j, int insertionValue, int insertionIndex) {
        if (j < 0 || arr[j] <= insertionValue) {
            // insert
            arr[insertionIndex] = insertionValue;
            return;
        }
        // shift
        arr[insertionIndex] = arr[j];

        sort(arr, j - 1, insertionValue, insertionIndex - 1);
    }
}

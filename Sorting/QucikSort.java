//pivot
public class QucikSort {

    public static int[] quicksortFn(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivotIndex = partion(arr, low, high);
        sort(arr, low, pivotIndex - 1);
        sort(arr, pivotIndex + 1, high);
    }

    public static int partion(int[] arr, int low, int high) {
        int j = high;
        int i = low;
        int pivot = arr[low];
        while (i < j) {

            // find i whihc is higher or equal

            while (i < high && arr[i] <= pivot) {
                i++;
            }
            while (j > low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }

        }
        // put the pivot at coorect

        swap(arr, j, low);
        return j;
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}

// time complext = n lon n
// space complexti =
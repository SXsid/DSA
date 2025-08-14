public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {};
        mergesort(arr, 0, arr.length - 1);

    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);

        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        // a new merge array
        int[] temp = new int[high - low + 1];

        int leftArrayPointer = low;
        int rightArrayPointer = mid + 1;
        int k = 0;

        while (leftArrayPointer <= mid && rightArrayPointer <= high) {
            if (arr[leftArrayPointer] < arr[rightArrayPointer]) {
                temp[k++] = arr[leftArrayPointer++];
            } else {
                temp[k++] = arr[rightArrayPointer++];
            }

        }
        // add remin in the temp array
        // we can't overwrite the orignal arr as the sequece which we accesing is not
        // rep correct order and swapping can cost over wiring
        while (leftArrayPointer <= mid) {
            temp[k++] = arr[leftArrayPointer++];
        }
        while (rightArrayPointer <= high) {
            temp[k++] = arr[rightArrayPointer++];
        }

        // now relect this joint sorted arr in orignal arr
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}

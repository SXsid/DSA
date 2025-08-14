public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 3, 2, 1 };
        for (int i = 0; i < args.length - 1; i++) {
            int minIndex = i;
            // linear serach
            for (int j = i; j < arr.length; j++) {
                // find min
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }
}

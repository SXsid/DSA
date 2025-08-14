public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {};
        for (int i = 1; i < args.length; i++) {
            for (int j = i - 1; j >= 0; j++) {
                if (arr[j] < arr[j + 1]) {
                    break;
                }
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }

        }
    }

}

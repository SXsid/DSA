
public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {};

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            // on whole iternaiton no elemt is biiger thatn perivous
            // means array is sorted so optimmize to break earl
            if (!swapped) {
                break;
            }
        }
    }

}

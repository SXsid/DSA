package Array;

class collect_zero {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 2, 3};
        int post = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[post++] = arr[i];
            }
        }

        while (post < arr.length) {
            arr[post++] = 0;

        }
    }

    public static void optimal(int[] arr) {
        int zeroIndex = 0; // pointer to first zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Find the next available zero slot
                while (zeroIndex < arr.length && arr[zeroIndex] != 0) {
                    zeroIndex++;
                }
                // Only swap if zeroIndex is behind i
                if (zeroIndex < i) {
                int temp = arr[i];
                    arr[i] = arr[zeroIndex];
                    arr[zeroIndex] = temp;
                    zeroIndex++; // move to next zero
                }
            }
        }
    }
}

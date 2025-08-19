package Array;

public class Rotate_arry_D_place {

    public void rotate(int[]arr , int d){
        int n = arr.length;
        d = d%n;

        Reverse(arr, 0, n-1);
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);


    }
public static void Reverse(int []arr , int low , int high){
        while (low<high) {
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            
        }
    }
}
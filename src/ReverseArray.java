import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int temp;
        //length-1 because we want to find the index
        int length = arr.length-1;
        //we should stop at length/2
        for(int i = 0; i <= arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[length-i];
            arr[length-i] = temp;
        }
    }
}

import java.util.Arrays;

public class SortArrayTwo {
    public static void main(String[] args) {
        int[] arr = {4, 1, 90, 2, 3, 41, 42, 63, 36, 44, 31,6};
        int[] copyArray = arr.clone();
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

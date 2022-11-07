public class SortAnArray {
    public static void main(String[] args) {
        //int[] arr = new int[10];
        int[] arr = new int[]{40, 20, 2, 30, 1, 3, 4, 10, 7, 11};
        int[] arrSorted = new int[arr.length];
        int temp = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                //temp < arr[j] ? temp : arr[j]
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

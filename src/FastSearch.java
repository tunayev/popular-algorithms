public class FastSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 11, 15, 20, 27, 34, 45, 72, 77, 80, 81};
        //int[] arr = {1, 2, 3, 4, 5, 6};
        //           0  1  2  3  4  5
        int num = 5;
        System.out.println(lookFor(num, arr));
    }

    private static int lookFor(int num, int[] arr) {
        int high = arr.length-1;
        int low = 0;

        while(high >= low) {
            int midPoint = (high+low)/2;
            if(num == arr[midPoint]) {
                return midPoint;
            }
            else if(num < arr[midPoint]) {
                // "high" goes to left, till it goes under "low"
                high = midPoint-1;
            } else if ( num > arr[midPoint]) {
                //"left goes to rigth, till it goes above "high"
                low = midPoint+1;
            }
        }
        // loop breaks...
        return -1;
    }
}

import java.util.Arrays;

public class PrintAllRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr.length];

        createPerm(2, arr);
    }
    public static void createPerm(int index, int[] elements) {
        if(index == elements.length-1) {
            printArray(elements);
            return;
        } else {
            for (int i = index; i < elements.length-1; i++){
                swap(elements, i, index);
                createPerm(index+1, elements);
                swap(elements, i, index);
            }
        }
    }

    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
    private static void printArray(int[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}

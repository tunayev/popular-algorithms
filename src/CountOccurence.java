import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        int nums = 50;
        int[] arr = new int[nums]; // int arr[] = {0, 0, 0}

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers");
        while(true) {
            int num = input.nextInt();

            if(num == 0)
                break;

            arr[num]++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("\n%d is entered %d times", i, arr[i]);
        }
    }
}

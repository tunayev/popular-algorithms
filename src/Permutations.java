import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Enter 4 numbers");
        while(inputs.size() < 4) {
            int next = input.nextInt();
            inputs.add(next);
        }
        int[][] arrs = new int[4][4];
        for(int i = 0; i < inputs.size(); i++) {
            for(int j = i; j >= 0; j-- ) {
                arrs[i][j] = j;
            }
        }

        System.out.println(Arrays.toString(arrs));
    }
}

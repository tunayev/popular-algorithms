import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        //int arr[] = new[];
        //Arrays.toString(arr);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values (not repetitive). ");
        int value;
        do {
            value = input.nextInt();
            if(newList.contains(value))
                continue;
            if(value != 0)
                newList.add(value);
        } while (value != 0);

        String myInputs = newList.toString();

        System.out.printf("The list is %s", myInputs);
    }
}

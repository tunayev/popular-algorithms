import java.util.Scanner;
import java.util.SimpleTimeZone;

public class CountNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[] countArray = new int[50];

        int num;
        while(true) {
            num = input.nextInt();
            if(num == 0)
                break;
            countArray[num]++;
        }
        for(int i = 0; i < countArray.length; i++) {
            System.out.printf("%d occured %d times \n", i, countArray[i]);
        }
    }
}

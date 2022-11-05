import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to check out");
        int num = input.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Not prime!");*/
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = i;
        }

        boolean[] primeArray = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {
            primeArray[i] = isPrime(i);
        }

        for(int i = 0; i < primeArray.length; i++)
            System.out.printf("\n %d %B", i, primeArray[i]);
    }

    public static boolean isPrime(int num) {
        int half = num / 2 + 1;
        if(num == 1)
            return false;
        for(int i = 2; i < num/2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

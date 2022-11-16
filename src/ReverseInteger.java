public class ReverseInteger {
    public static void main(String[] args) {
        int test = 123456;
        System.out.println(reverse(test));
    }

    private static int reverse(int test){
        int reversed = 0;
        while(test > 0) {
            int remainder = test % 10;
            reversed = reversed * 10 + remainder;
            test = test/10;
        }

        return reversed;
    }


}

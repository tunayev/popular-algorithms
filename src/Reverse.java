public class Reverse {
    public static void main(String[] args) {
        int num = 123456;

        int reverse = reverse(num);

        System.out.println(reverse);
    }

    public static int reverse(int num) {
        String numString = Integer.toString(num);
        int length = numString.length();
        String reverseString = "";

        for(int i = length-1; i > -1; i--) {
            reverseString += numString.charAt(i);
        }

        return Integer.parseInt(reverseString);

    }
}

import java.io.*;
import java.util.*;

public class RandomShuffle {
    public static void main(String args[]) {
        //int[] arr = new int[10];

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i =0; i < arr.length-1; i++) {
            int rand = (int) (Math.random() * arr.length);
            int temp = arr[rand];
            arr[rand] = arr[i];
            arr[i] = temp;
        }

        for(int e: arr) {
            System.out.println(e);
        }
        //System.out.println("Array index is" + arr.toString());
    }
}
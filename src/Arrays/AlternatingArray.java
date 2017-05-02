package Arrays;

import java.util.Arrays;

/**
 * a1<=a2>=a3<=a4>=a5...
 * <p>
 * Created by salonibindra on 1/24/17.
 */
public class AlternatingArray {

    public static void altArraySort(int[] input) {
        Arrays.sort(input);
        System.out.println("Original Array :");
        for (int y : input) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("Result: ");

        for (int i = 0, j = input.length - 1; i < input.length / 2; i++, j--) {
            System.out.print(input[i] + " " + input[j] + " ");
        }

    }

    public static void altArraySwap(int[] input) {
        for (int i = 0; i < input.length-1 ; i++) {

        }

    }

    public static void main(String[] args) {
        int[] input = {4, 2, 6, 7, 8, 5, 9, 11};
//        for (int y : input) {
//            System.out.print(y + "  ");
//
//        }
        altArraySort(input);
        altArraySwap(input);

    }
}

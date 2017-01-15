import java.util.*;

/**
 * Created by salonibindra on 1/9/17.
 */
public class RotateArray {

    public static void main(String[] args) {
       // System.out.println("hry");
        RotateArray r = new RotateArray();
        //r.disp();
       // r.rotate_right();
        DuplicateCharInString ob = new DuplicateCharInString();
        String s = "asdfyu";
        boolean b = ob.Unique_Char(s);
        System.out.println(b);

    }

    public void disp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want to reverse :");
        String s = sc.nextLine();
        System.out.println(s);


    }

    public void rotate_right() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of elements in array");
        int n = sc.nextInt();
        int a[] = new int[n];


        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        System.out.println("Enter the number of elements to be rotated");
        int k = sc.nextInt();

        int temp[] = new int[k];

        for (int i = 0, j = n - 1; i < k; i++, j--) {
            temp[i] = a[j];
            System.out.print(temp[i] + " ");

        }
        System.out.println();

        for (int i = n - k - 1, j = n - 1; i >= 0; i--, j--) {
            a[j] = a[i];
            System.out.print(a[i] + " " + j);

        }
        System.out.println();

        for (int i = 0, j = k - 1; i < k; i++, j--) {
            a[i] = temp[j];
            System.out.print(a[i] + " is at " + i + "  ");

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");

        }
    }

    public void rotate_left() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number of elements in array");
        int n = sc.nextInt();
        int a[] = new int[n];


        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        System.out.println("Enter the number of elements to be rotated");
        int k = sc.nextInt();

        int temp[] = new int[k];

        for (int i = 0, j = 0; i < k; i++, j++) {
            temp[i] = a[j];
            System.out.print(temp[i] + " ");

        }
        System.out.println();

        for (int i = n - k - 1, j = n - 1; i >= 0; i--, j--) {
            a[j] = a[i];
            System.out.print(a[i] + " " + j);

        }
        System.out.println();

        for (int i = 0, j = k - 1; i < k; i++, j--) {
            a[i] = temp[j];
            System.out.print(a[i] + " is at " + i + "  ");

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");

        }

    }
}


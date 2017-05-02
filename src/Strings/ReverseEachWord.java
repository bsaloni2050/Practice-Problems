package Strings;

/**
 * given a sentence. Reverse each word individually in the sentence.
 * <p>
 * Created by salonibindra on 1/24/17.
 */
public class ReverseEachWord {
    public static void reveWord(String s) {

        if (s == null || s.length() == 0) {
            System.out.println(s);
            return;
        }
        s=s.trim();

        String[] words = s.split(" ");

        for (String w : words) {
            // System.out.println(w);
            char[] x = w.toCharArray();
            for (int i = 0, j = w.length() - 1; i < w.length() / 2; i++, j--) {
                char temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                w = new String(x);

            }
            System.out.print(w + " ");

        }

    }

    public static void main(String[] args) {
        // String str = "a new brown lazy fox jump over the fence";
        String str1 = "";
        reveWord(str1);
        String str = "    a new brown lazy fox jump over the fence";



    }

}

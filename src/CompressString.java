import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by salonibindra on 1/17/17.
 */
public class CompressString {
    public static void main(String[] args) {
        String s = "aabbbcccd";
        compessedCounts(s);

    }

    public static void compessedCounts(String s) {
        int freq = 1;
            s+=" ";
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                freq++;
              // System.out.println(i);
            }
            else {
                System.out.print(s.charAt(i)+"-"+freq+" ");
                freq = 1;
            }


        }
    }


}

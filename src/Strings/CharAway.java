package Strings;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by salonibindra on 1/17/17.
 */
public class CharAway {

    public static void main(String[] args) {
        String str1 = "pale";
        int len1 = str1.length();
        String str2 = "ple";
        int len2 = str2.length();
        int i = 0;
        int j = 0;
        boolean flag = false;

        while (i < len1 && j < len2) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (flag) {
                    System.out.println("False" );
                    return;
                }
                flag = true;
                if (len1 == len2) {
                    j++;
                }
            } else {
                j++;
            }
            i++;
        }
        System.out.println("true");
    }
}


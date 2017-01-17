/**
 * Created by salonibindra on 1/17/17.
 */
public class RotateString {
    public static boolean subStringRotate(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2 || len1 < 0)
            return false;

        return isSubstring((str1 + str1), str2);
    }

    public static boolean isSubstring(String str, String sub) {

        return (str.indexOf(sub)) > 0;
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        //System.out.println(isSubstring(str1,str2));
        System.out.println(subStringRotate(str1, str2));


    }
}

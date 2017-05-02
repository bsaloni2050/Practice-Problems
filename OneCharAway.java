//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
//
//import java.util.HashSet;
//
///**
// * Created by salonibindra on 1/16/17.
// */
//public class OneCharAway {
//    public static boolean checkSimilarity(String str1, String str2) {
//        HashSet<Character> hs = new HashSet<>();
//        int len1 = str1.length();
//        int len2 = str2.length();
//
//        if (Math.abs(len1 - len2) > 1)
//            return false;
//
//        if (len1 > len2) {
//            for (char c : str1.toCharArray()) {
//                hs.add(c);
//            }
//            for (char c : str2.toCharArray()) {
//                hs.remove(c);
//            }
//
//        } else {
//            for (char c : str2.toCharArray()) {
//                hs.add(c);
//            }
//            for (char c : str1.toCharArray()) {
//                hs.remove(c);
//            }
//        }return !(hs.size() > 1);
//    }
//
//    public static boolean replaceOneCharAway(String str1, String str2){
//            //int
//    }
//
////    public static void main(String[] args) {
////        String str1 = "elap";
////        int len1 = str1.length();
////        String str2 = "ale";
////        int len2 = str1.length();
////
////        if (Math.abs(len1 - len2) > 1)
////            System.out.println("False");
////
////        if (str1.length()==str2.length())
////            System.out.println(replaceOneCharAway(str1,str2));
////        else
////            System.out.println(InDelOneChar(str1,str2));
//
//
//       // System.out.println(checkSimilarity(str1, str2));
//    }
//

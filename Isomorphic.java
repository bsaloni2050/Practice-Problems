import java.util.*;
import com.google.common.base.Strings;
import java.util.HashMap;

public class Isomorphic {
	public static void main(String args[]) {
		String s = null;
		if ("HI".equals(s))
			System.out.println("Passed");
		else
			System.out.println("not");

		String s1 = "ab";
		String s2 = "ca";
		System.out.println();
		System.out.println(isIsomorphic(s1, s2));
	}

	private static boolean isIsomorphic(String s1, String s2) {
		if (Strings.isNullOrEmpty(s1) || Strings.isNullOrEmpty(s2)) {
			return false;

		}
		if (s1.length() != s2.length()) {
			return false;
		}

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (map.containsKey(c1)) {
				if (c2 != map.get(c1)) {
					System.out.println(c2 + " not queal1 to " + c1);
					return false;
				}
			} else if (map.containsValue(c2)) {
				return false;

			} else {
				map.put(c1, c2);
				System.out.println("putting " + c1 + c2);
			}
		}
		return true;

	}

}

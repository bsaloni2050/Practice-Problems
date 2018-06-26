import java.util.HashMap;

import com.google.common.base.Strings;

public class WordPattern {
	public static void main(String args[]) {

		String pattern = "abba";
		String word = "dog dog dog dog";
		System.out.println();
		System.out.println(isIsomorphicP(pattern, word));
	}

	private static boolean isIsomorphicP(String pattern, String word) {
		if (Strings.isNullOrEmpty(pattern) || Strings.isNullOrEmpty(word)) {
			return false;
		}

		HashMap<Character, String> map = new HashMap<Character, String>();

		String[] words = word.split(" ");
		if(pattern.length()!= words.length)
		    return false;

		for (int i = 0; i < words.length; i++) {
			char c1 = pattern.charAt(i);
			String c2 = words[i];

			if (map.containsKey(c1)) {
				if (!c2.equals(map.get(c1))) {
					return false;
				}
			} else if (map.containsValue(c2)) {
				return false;
			} else {
				map.put(c1, c2);
			}
		}

		return true;
	}

}

package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {

		String test = "I am a Software tester";
		String[] words = test.split(" ");

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			if (i % 2 != 0) {
				char[] chars = words[i].toCharArray();

				for (int j = chars.length - 1; j >= 0; j--) {
					result.append(chars[j]);
				}

			} else {

				result.append(words[i]);

			}
			
			result.append(" ");

		}

		System.out.println(result.toString().trim());
	}

}

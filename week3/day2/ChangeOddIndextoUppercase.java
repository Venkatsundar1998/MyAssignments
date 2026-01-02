package week3.day2;

public class ChangeOddIndextoUppercase {

	public static void main(String[] args) {

		String str = "changeme";
		char[] chars = str.toCharArray();

		StringBuilder result = new StringBuilder();
		for (int i = 0; i <= chars.length - 1; i++) {
			if (i % 2 != 0) {
				chars[i] = Character.toUpperCase(chars[i]);
				result.append(chars[i]);
			} else {
				result.append(chars[i]);
			}
		}
		System.out.println(result.toString());
	}
}

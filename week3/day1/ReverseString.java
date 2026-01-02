package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		String companyName = "radar";
		String emptystring = "";
		for (int i = companyName.length() - 1; i >= 0; i--) {
			emptystring = emptystring + companyName.charAt(i);
		}
		if (companyName.equals(emptystring)) {
			System.out.println("The String is palindrome");
		} else {
			System.out.println("The String is not palindrome");
		}

	}
}

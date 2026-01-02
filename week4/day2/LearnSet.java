package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		String companyName = "google";
		char[] array = companyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();

		for (int i = 0; i < array.length; i++) {
			unique.add(array[i]);
		}
		for (Character character : unique) {
			System.out.print(character);
		}

	}

}

package week3.day2;

public class FindMissingElement {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		int b = 8;
		Boolean found;

		for (int i = 1; i <= b; i++) {
			found = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				int missingvalue = i;
				System.out.println(missingvalue);

			}
		}
	}

}

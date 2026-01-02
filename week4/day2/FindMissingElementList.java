package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 10, 6, 8 };
		int b = 10;
		Boolean found;

		List<Integer> list = new ArrayList<Integer>();

		for (Integer value : array1) {
			list.add(value);
		}

		for (int i = 1; i <= b; i++) {
			found = false;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				int missingValue = i;
				System.out.println(missingValue);
			}
		}

	}

}

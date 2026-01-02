package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		int[] num = { 3, 2, 11, 4, 6, 7 };
		int result = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (Integer value : num) {
			list.add(value);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size() - 1; i++) {
			result = list.get(i);
		}
		System.out.println(result);
	}
}

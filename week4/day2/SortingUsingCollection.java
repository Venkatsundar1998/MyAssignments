package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> companyList = new ArrayList<String>();
		for (String company : companies) {
			companyList.add(company);
			Collections.sort(companyList);
		}
		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.print(companyList.get(i));
			if (i != 0) {
				System.out.print(", ");
			}
		}
	}
}

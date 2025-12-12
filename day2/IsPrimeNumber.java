package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 97;
		Boolean isprime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime && number > 1) {
			System.out.println("It's Prime Number");
		} else {
			System.out.println("It's Not a Prime Number");
		}

	}
}

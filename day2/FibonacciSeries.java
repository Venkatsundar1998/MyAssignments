package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int start=0;
		int end=13;
		
		while (a <= end) {
            if (a >= start) {
                System.out.println(a);
            }

            int c = a + b;
            a = b;
            b = c;
        }
	}

}

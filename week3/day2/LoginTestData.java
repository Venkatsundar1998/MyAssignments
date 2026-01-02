package week3.day2;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("The username is Venkat");
	}

	public void enterPassword() {
		System.out.println("The Password is Venkat@123");
	}

	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.navigateToHomePage();
	}

}

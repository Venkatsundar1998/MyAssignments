package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Selected the Cash on delivery option");

	}

	@Override
	public void upiPayments() {
		System.out.println("Selected the UPI payment option");

	}

	@Override
	public void cardPayments() {
		System.out.println("Selected the Card payment option");

	}

	@Override
	public void internetBanking() {
		System.out.println("Selected the Internet Banking option");

	}

	public static void main(String[] args) {
		Amazon an = new Amazon();
		an.cashOnDelivery();
		an.upiPayments();
		an.cardPayments();
		an.internetBanking();
		an.recordPaymentDetails();
	}

}

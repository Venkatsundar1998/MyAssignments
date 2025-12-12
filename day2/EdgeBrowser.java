package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser ebr=new Browser();
		ebr.launchBrowser("EdgeBrowser");
		String lu=ebr.loadUrl();
		System.out.println(lu);

	}

}

package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Taking Snap");
	}

	public void clearCookies() {
		System.out.println("Clear the Cookies");
	}

	public static void main(String[] args) {

		Edge ed = new Edge();
		ed.openURL();
		ed.navigateBack();
		ed.closeBrowser();
		ed.takeSnap();
		ed.clearCookies();
		ed.browserName = "Edge";
		ed.versionName = "version 150";
		System.out.println("Browser Name" + ":" + ed.browserName);
		System.out.println("Version Name" + ":" + ed.versionName);

	}
}

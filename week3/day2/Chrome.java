package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open Incognito tab");
	}

	public void clearCache() {
		System.out.println("Clear the caches");
	}

	public static void main(String[] args) {

		Chrome ch = new Chrome();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openIncognito();
		ch.clearCache();
		ch.browserName = "Chrome";
		ch.versionName = "version 143";
		System.out.println("Browser Name" + ":" + ch.browserName);
		System.out.println("Version Name" + ":" + ch.versionName);
	}
}

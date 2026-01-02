package week3.day2;

public class Safari extends Browser {

	public void readerMode() {
		System.out.println("Reader mode is on");
	}

	public void fullScreenMode() {
		System.out.println("FullScreen mode is on");
	}

	public static void main(String[] args) {

		Safari sf = new Safari();
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();
		sf.browserName = "Safari";
		sf.versionName = "version 201";
		System.out.println("Browser Name" + ":" + sf.browserName);
		System.out.println("Version Name" + ":" + sf.versionName);

	}
}

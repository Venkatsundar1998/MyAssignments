package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {

		// Single Inheritance
		Button bt = new Button();
		bt.click();
		bt.submit();
		bt.setText("WebElement Class setText Method");

		// Hierarchical Inheritance
		bt.click();
		bt.setText("WebElement Class setText Method");
		bt.submit();

		TextField tx = new TextField();
		tx.getText();
		tx.click();
		tx.setText("WebElement Class setText Method");

		// Multilevel Inheritance
		ChechBoxButton cbt = new ChechBoxButton();
		cbt.clickCheckButton();
		cbt.submit();
		cbt.click();
		cbt.setText("WebElement Class setText Method");

		RadioButton rbt = new RadioButton();
		rbt.selectRadioButton();
		rbt.submit();
		rbt.click();
		rbt.setText("WebElement Class setText Method");

	}

}

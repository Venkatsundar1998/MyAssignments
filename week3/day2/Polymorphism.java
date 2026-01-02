package week3.day2;

public class Polymorphism {
	
	public void reportStep(String msg,String status) {
		System.out.println("Message"+":"+msg+"Status"+":"+status);
	}
	
	public void reportStep(String msg,String status,Boolean snap){
		System.out.println("Message"+":"+msg+"Status"+":"+status+"Snap"+":"+false);
	}

	public static void main(String[] args) {
		
		Polymorphism pl=new Polymorphism();
		pl.reportStep("Hello", "Pass");
		pl.reportStep("Welcome", "Fail", false);
		
	}

}

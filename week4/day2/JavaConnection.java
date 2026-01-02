package week4.day2;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected succesfully");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected Succesfully");
	}

	@Override
	public void executeUpdate() {
		System.out.println("updates are executed");
	}

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}
}

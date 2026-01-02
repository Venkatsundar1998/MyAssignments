package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The Endpoint is" + ":" + endpoint);
	}
	
	public void sendRequest(String endpoint, String requesbody, Boolean requeststatus) {
		System.out.println("The Endpoint is"+":"+endpoint);
		System.out.println("The Requestbody is"+":"+requesbody);
		System.out.println("The RequestStatus is"+":"+requeststatus);

	}


	public static void main(String[] args) {
		
		APIClient api=new APIClient();
		api.sendRequest("https://api.sampleapis.com/coffee/hot");
		api.sendRequest("https://api.sampleapis.com/coffee/hot", "{sample Request Body}", true);

	}

}

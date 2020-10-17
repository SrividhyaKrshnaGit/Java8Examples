package functionalInterface;

public class RunnableExample {

	public static void main(String[] args) {
     
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable");
			}
			
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(() ->System.out.println("Inside the Lambda Runnable interface"));
		myLambdaThread.run();
	}

}

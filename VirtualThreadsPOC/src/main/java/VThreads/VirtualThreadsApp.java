package VThreads;

public class VirtualThreadsApp {

	public static void main(String[] args) {
		
		try {
			Thread thread1 = Thread.startVirtualThread(t1);
			Thread thread2 = Thread.startVirtualThread(t2);
			
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i<10; i++) {
				System.out.println("Thread 1: "+ i);
			}
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			for (int j = 0; j<10; j++) {
				System.out.println("Thread 2: "+ j);
			}
		}
	};

}

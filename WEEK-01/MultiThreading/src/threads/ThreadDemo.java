package threads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		int x;

		ThreadDemo t1 = new ThreadDemo();
		System.out.println(t1);
		t1.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
		}

	}

	@Override
	public void run() {
		// System.out.println("run() is called..");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child Thread");
		}

	}
}
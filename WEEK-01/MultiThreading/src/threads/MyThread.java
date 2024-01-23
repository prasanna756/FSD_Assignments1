package threads;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setPriority(MAX_PRIORITY-1);
		
	    t1.setPriority(MIN_PRIORITY);
	    t1.setPriority(NORM_PRIORITY);
	    t1.setName("Child-1");
		System.out.println(t1);
		System.out.println(t1.isAlive());
		
		t1.start();

		MyThread t2 = new MyThread();
		t2.setPriority(10);
		t2.setName("Child-2");
		System.out.println(t2);
		t2.start();
		
		
		
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}

package threads;

import java.io.IOException;
import java.nio.CharBuffer;

public class ThreadImp implements Runnable {

	public static void main(String[] args) {
		Runnable t1= new ThreadImp();
		Thread td= new Thread(t1, "child-1");

		
		System.out.println(td);
		td.start();

	}

	@Override
	public void run() {
		System.out.println("run() is called...");
		
	}
}

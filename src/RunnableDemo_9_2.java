 //实现Runnable接口

class MyThread implements Runnable{
	private int ticket =5;
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (ticket>0) {
				System.out.println("卖票：ticket = "+ ticket--);
			}
		}
	}
	
}

public class RunnableDemo_9_2 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		new Thread(myThread).start();
		new Thread(myThread).start();
		new Thread(myThread).start();
		
//		MyThread myThread2 = new MyThread();
//		new Thread(myThread2).start();
//		new Thread(myThread2).start();
//		new Thread(myThread2).start();
	}

}

//ȡ�ú������̵߳�����
class GetThreadName implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()
					+"���У�i="+i);
		}
	}
	
}

public class RunnableDemo_9_4_1 {

	public static void main(String[] args) {
		GetThreadName getThreadName = new GetThreadName();
		new Thread(getThreadName).start();
		new Thread(getThreadName,"�߳�A").start();			
		new Thread(getThreadName).start();
		
	}

}

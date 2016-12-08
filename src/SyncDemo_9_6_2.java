//ͬ�������

class SynThread implements Runnable{
	private int ticket = 5;
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (this) {
				if (ticket>0) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("��Ʊ��ticket = "+ ticket--);
				}
			}
		}
	}
	
}
public class SyncDemo_9_6_2 {

	public static void main(String[] args) {
		SynThread synThread = new SynThread();
		new Thread(synThread,"�߳�A").start();
		new Thread(synThread,"�߳�B").start();
		new Thread(synThread,"�߳�C").start();
		
	}

}

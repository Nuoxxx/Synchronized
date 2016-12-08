//取得和设置线程的名称
class GetThreadName implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()
					+"运行，i="+i);
		}
	}
	
}

public class RunnableDemo_9_4_1 {

	public static void main(String[] args) {
		GetThreadName getThreadName = new GetThreadName();
		new Thread(getThreadName).start();
		new Thread(getThreadName,"线程A").start();			
		new Thread(getThreadName).start();
		
	}

}

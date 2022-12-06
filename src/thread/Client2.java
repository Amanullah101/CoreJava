package thread;

public class Client2 {

	public static void main(String[] arg) {
		Counter2 counterA = new Counter2();
		Thread worker = new Thread(counterA,"Counter A");
		System.out.println("my work is here:"+worker);
		worker.start();
		try {
			int val;
			do {
				val = counterA.getCurrentValue();
				System.out.println("Counter value read by"+Thread.currentThread().getName()+""+val);
				Thread.sleep(1000);
				
			}while(val<5);
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+"Interrupted");
		}
		System.out.println("Exit from main method");
	}
}

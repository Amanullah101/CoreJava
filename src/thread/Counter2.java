package thread;

public class Counter2 implements Runnable {
    private int currentValue;
    
    public Counter2() {
    	currentValue = 0;
    }
    public int getCurrentValue() {
    	return currentValue;
    }
	@Override
	public void run() {
		try {
			while(currentValue < 5) {
				System.out.println("first time to enter"+Thread.currentThread().getName()+" ;"+(currentValue));
				Thread.sleep(250);
			}
		}
		catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+"Interrupted");
		}
		System.out.println("Exit from thread"+Thread.currentThread().getName());
		
	}

}

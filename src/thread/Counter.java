package thread;

 public class Counter extends Thread {
      private int currentValue;
      
      public Counter(String threadName) {
    	  super(threadName);
    	  currentValue  = 0;
    	  System.out.println(this);
    	  start();
      }
	public void run() {
		try {
			while(currentValue < 5) {
				System.out.println(getName()+" ;"+(currentValue));
				Thread.sleep(250);
			}
		}
		catch(InterruptedException e) {
			System.out.println(getName()+"Interrupted");
		}
		System.out.println("Exit from thread"+getName());
	}
}


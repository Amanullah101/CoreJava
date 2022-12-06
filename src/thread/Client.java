package thread;

public class Client {
public static void main(String[] arg) {
	System.out.println("main() runs in thread"+Thread.currentThread().getName());
	Counter counterA = new Counter("Counter A");
	Counter counterB = new Counter("Counter B");
	System.out.println("Exit from main method");
}
}

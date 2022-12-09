package wrapper;

public class Number {
 
	public static void main(String[] arg) {
		int x = 5;
		Integer i  = new Integer(x);//boxing
		int z = i;//autounboxing
		System.out.println("value from autounboxing="+z);
		int y = i.intValue();
		
		System.out.println(i);
		System.out.println(i.intValue());//unboxing
		
		i = 10;// AutoBoxing
		
	}
}

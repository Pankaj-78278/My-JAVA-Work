package Q3;

import java.util.function.Supplier;

public class Demo {
	public static void main(String[] args) {
		
		Supplier<String> s1 = new MySupplier();
		
		String st= s1.get();
		System.out.println(st);
		
		Supplier<String> s2 =()->"this is lE Supplier"; 
		
		System.out.println(s2.get());
	}
}

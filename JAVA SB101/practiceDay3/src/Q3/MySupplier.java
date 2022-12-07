package Q3;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String> {

	@Override
	public String get() {
		 return "msg from the external class";
	}

	
	
	
}

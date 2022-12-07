package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	Intr Fun1() {
		System.out.println("inside the Fun1");
		
//		Intr i1= new IntrImpl();
//		return i1;
		
//		Intr Le=s-> System.out.println("Welcome in LE"+s);
//		return Le;
		
		return s->System.out.println("Welcome in LE " +s) ;
//		return new IntrImpl();
	}
	public static void main(String[] args) {
		Demo demo =new Demo();
		
		Intr s=demo.Fun1();
		s.thing("Rajeev");
//		System.out.println(s);
	}
	
}

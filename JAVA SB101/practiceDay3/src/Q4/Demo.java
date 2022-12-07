package Q4;

import java.util.function.Function;

public class Demo {
	
	public static void main(String[] args) {
		Function<Student,Integer> f1 =new MyFunction();
		Integer res=f1.apply(new Student(10, "Rajjev", 600 ));
		System.out.println(res);
		
		Function<Student,Integer> f2=(s-> s.getMarks()>500?+1:-1);
		System.out.println(f2.apply(new Student(11, "vicky", 450 )));
	}
	
}

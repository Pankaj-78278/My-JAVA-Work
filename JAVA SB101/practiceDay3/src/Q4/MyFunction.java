package Q4;

import java.util.function.Function;

public class MyFunction implements Function<Student, Integer>{

	@Override
	public Integer apply(Student t) {
//		if(t.getMarks()>500) {
//			return "Pass";
//		}else {
//			return "Fail";
//		}
		
		return t.getMarks() > 500 ? +1 : -1;
	}

}

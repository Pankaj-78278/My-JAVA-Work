package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer>  i1= new ArrayList<>();
		
		i1.add(new Integer(10));
		i1.add(new Integer(20));
		i1.add(new Integer(30));
		i1.add(new Integer(40));
		i1.add(new Integer(50));
		
		i1.forEach(s->System.out.println(s)); 
		
		System.out.println("------- End LIst -----------");
		
		Stream<Integer> str1= i1.stream();
		
		str1
		.map(s->new Integer(s.getNo()*s.getNo()))
		.collect(Collectors.toList())
		.forEach(s->System.out.println(s));
		
		System.out.println("------- End  map LIst -----------");
	}
}

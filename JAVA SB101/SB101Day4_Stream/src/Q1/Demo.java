package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		List<Product> l1= new ArrayList<Product>();
		l1.add(new Product(10,"laptop",40000,5));
		l1.add(new Product(11,"phone",30000,8));
		l1.add(new Product(10,"mac",80000,1));
		l1.add(new Product(10,"charger",10000,50));
		l1.add(new Product(10,"adapter",4000,30));
		
//		Stream<Product> str1= l1.stream();
//		Stream<Product> str2=str1.filter(s-> s.getQuantity()>10);
//		str2.forEach(s -> System.out.println(s));
		l1.forEach(s ->System.out.println(s));
		System.out.println("--------End Of List-------------");
		
		l1.stream()
					.filter(s -> s.getQuantity()>10)
					.sorted((o1, o2) -> o1.getQuantity()>o2.getQuantity()?+1:-1)
					.collect(Collectors.toList())
					.forEach(s -> System.out.println(s));
		System.out.println("--------End of Sorted list ------");
	}
}

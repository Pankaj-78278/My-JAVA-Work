package Q2;

import java.util.Comparator;

public class SortSalary implements Comparator<Employee>{
		
			@Override
			public int compare(Employee s1, Employee s2) {
				if(s1.getSalary()>s2.getSalary()) {
					return +1;
				}else if(s1.getSalary()<s2.getSalary()) {
					return -1;			
				}else {
					return s1.getEmpName().compareTo(s2.getEmpName());
				}
			}
			
}


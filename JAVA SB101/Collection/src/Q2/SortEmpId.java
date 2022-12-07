package Q2;

import java.util.Comparator;

public class SortEmpId  implements Comparator<Employee>{

	@Override
	public int compare(Employee s1, Employee s2) {
		return s1.getEmpId()> s2.getEmpId()? +1:-1;
	}
	
}

package Day5_Q1;

public class Practice1 {
			String id="E-1s11";
			String name="Ramesh";
			double salary=25000.00;
			String address="Hyderabad";
			public void displayDetails(){
			System.out.println("Employee Details");
			System.out.println("-------------------");
			System.out.println("Employee Id :"+id);
			System.out.println("Employee Name :"+name);
			System.out.println("Employee Saslary:"+salary);
			System.out.println("Employee Address:"+address);
		}
		
		
//		public class Main{
			public static void main(String[] args){
				Practice1 emp=new Practice1();
				emp.displayDetails();
			}
//		}
}

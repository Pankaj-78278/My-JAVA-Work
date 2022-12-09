package Day5_Q1;

public class Practice2 {
	Practice3 obj2= new Practice3();
	public static void main(String[] args) {
		System.out.println("Inside the main class");
		Practice2 obj1 =new Practice2();
		
		obj1.obj2.ChangeClass();
	}
	
}
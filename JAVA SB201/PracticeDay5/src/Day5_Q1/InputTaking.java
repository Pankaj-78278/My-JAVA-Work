package Day5_Q1;
import java.util.*;
public class InputTaking {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your Name");
		String alpha=  input.next();
		
		System.out.println("Enter your age");
		
		
		int age= input.nextInt();
		
		System.out.println(alpha+" "+ age);
				
	}

}

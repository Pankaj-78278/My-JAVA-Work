package Day5_Q1;

public class Control {
 String aman= "prem";
 void sum() {
	 System.out.println(this);
	 System.out.println(this.aman);
	 
 }
 public static void main(String[] args) {
	 Control obj= new Control();
	 System.out.println(obj);
	 obj.sum();
	 System.out.println(obj.aman);
	 
	
 }
}

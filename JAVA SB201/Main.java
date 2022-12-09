public class Main{
	String str= "Fatime";
	
public static void main(String[] args){
	
	System.out.println("Inside the Main");
	A obj2= new A();
	Main obj1= new Main();
	System.out.println(obj1.str);

	System.out.println(obj2.funA());
	
}

}
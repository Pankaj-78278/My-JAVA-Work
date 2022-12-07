package Q6;

//What if we call Java run() method directly instead start() method?

//--Each thread starts in a separate call stack.
//--Invoking the run() method from the main thread, the run() method goes onto the 
//	current call stack rather than at the beginning of a new call stack.


public class Demo extends Thread {
	 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 Demo t1=new Demo();  
		  t1.run();//fine, but does not start a separate call stack  
		 }  
}
//this is work as a normal class
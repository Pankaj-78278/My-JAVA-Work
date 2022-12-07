package Q1;
//What do you mean by Multithreading? Why is it important?

//		Multithreading is a programming concept in which the application can create a small unit of tasks to execute in
//		parallel. If you are working on a computer, it runs multiple applications and allocates processing power to them. A
//		simple program runs in sequence and the code statements execute one by one. This is a single-threaded application.
//		But, if the programming language supports creating multiple threads and passes them to the operating system to run
//		in parallel, it’s called multithreading.

//its doesnot block the user because threads are independent and you can multiple task at the same time.
//you can perform many operation together at the same time .
//Threads are the independent

		
		
		
public class MultithreadingMean {
	static void main() {
		for(int i=0;i<500;i++) {
			System.out.println("this run" +i);
		}
	}
	
	static void main2() {
		for(int i=502;i<510;i++) {
			System.out.println("this run" +i);
		}
	}
	
	public static void main(String[] args) {
		main();
		main2();
	}
}

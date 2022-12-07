package Q2;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.println("THis is the run A method");
		for(int i=21;i<30;i++) {
			String tname= Thread.currentThread().getName();
			System.out.println(tname+"is running ");
			System.out.println(i);
			
		}
		
	}
}

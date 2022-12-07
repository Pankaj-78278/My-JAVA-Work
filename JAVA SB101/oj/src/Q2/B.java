package Q2;

public class B implements Runnable {
@Override
public void run() {
	System.out.println("THis is the run  B method");
	for(int i=31;i<40;i++) {
		String tname= Thread.currentThread().getName();
		System.out.println(tname+"is running ");
		System.out.println(i);
	}
	
}
}

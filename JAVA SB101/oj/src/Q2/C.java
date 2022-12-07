package Q2;

public class C implements Runnable{
@Override
public void run() {
	System.out.println("THis is the run C method");
	for(int i=41;i<50;i++) {
		String tname= Thread.currentThread().getName();
		System.out.println(tname+"is running ");
		System.out.println(i);
	}
	
}
}

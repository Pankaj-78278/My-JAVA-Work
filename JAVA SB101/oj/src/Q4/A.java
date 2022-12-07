package Q4;

public class A implements Runnable {
	int sum;
	
	Thread t ;
	
	
	public A(Thread t) {
		this.t = t;
	}


	@Override
	public void run() {
		
		System.out.println("THis is the A demo method");
		for(int i=1;i<=10;i++) {
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			sum+=i;
			String tname= Thread.currentThread().getName();
			System.out.println(tname +" " + sum +" "+i);
		
					
		}
		
	}
}

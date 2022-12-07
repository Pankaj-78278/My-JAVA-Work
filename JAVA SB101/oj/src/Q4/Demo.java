package Q4;


public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
		A d1=new A(Thread.currentThread());	
		Thread tr =new Thread(d1);
		
		tr.setName("Vicky");
		tr.start();
		tr.join();
		int res=d1.sum;
		
		for(int i=0;i<10;i++) {
			System.out.println("This is the main class ");
			System.out.println(res);
		}
	}

}

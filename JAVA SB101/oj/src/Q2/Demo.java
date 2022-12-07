package Q2;


public class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("THis is the run demo method");
		for(int i=10;i<20;i++) {
			String tname= Thread.currentThread().getName();
			System.out.println(tname+"is running "+i);
			
//			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
					
		}
		
	}
	
	public static void main(String[] args) {
		Demo d1=new Demo();
//		A a1=new A();
//		B b1 =new B();
//		C c1= new C();
		Thread tr =new Thread(d1);
//		Thread trA =new Thread(d1);
//		Thread trB =new Thread(d1);
//		Thread trC =new Thread(d1);
		tr.setName("Vicky");
//		trA.setName("Rajeev");
//		trB.setName("Pankaj ");
//		trC.setName("PAnda");
//		trA.start();
//		trB.start();
//		trC.start();
		tr.start();
		
//		System.out.println("THis is the main method");
		for(int i=51;i<60;i++) {
			System.out.println("THis is the main method"+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		c1.start();
	}

}

package Q7;
public class RunThread implements Runnable{
public void run(){
	
	for(int i=0;i<10;i++){
	String tname=Thread.currentThread().getName();
	System.out.println(tname +": is running");
	}
	
}

	public static void main(String[] args){
		
		RunThread job=new RunThread();
		
		Thread one=new Thread(job);
		Thread two=new Thread(job);
		
		one.setName("Dhoni thread..");
		two.setName("Kohli thread..");
		
		
		one.setPriority(8);
		two.setPriority(10);
		
		
		one.start();
		two.start();
	}
	
}
package Q5;
//Differentiate between the Thread class and Runnable interface for creating a
//Thread?
// Thread class and Runnable interface r the two structure using which we imple Thread based multitasking in java.
// THread is (define job for a worker);
//	Runnable is (assign job to worker);
//the signature of a fun using which we imple a thread(or what job a thread has to do) is defined in an interface by name Runnable
//
//this interface belongs to java.lang package.
//
//this interface has only one method i.e
//
//public void run();


//	
//	
//
//	class Thread implements Runnable{ 
//
//	@Override
//	public void run(){
//	Thread class internally implements Runnable interface and  overrides the run() method with empty //implementation
//	}
//
//	other methods of Thread class(join, sleep, etc..)

//--here is a class by name Thread present in java.lang package,which has a method called start()
//this start() method is used to execute a given functionality as a seperate thread.


//--this start methods recognize the run() method of the Runnable interface and then run() method 
//is executed as a seperate individual thread.
//
//---here Thread class is like a worker who has to start the job individually 
//defined by run() method..in Runnable interface...

//}
 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

//public class Thread_Runnable {
//
//}

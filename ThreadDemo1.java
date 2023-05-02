package threads;

public class ThreadDemo1 extends Thread {
         // public void ThreadDemo(String name) {
        	//  super(name);
         // }
	
	public void run()
	{
		System.out.println("Thread is running..."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		//ThreadDemo1 t1 = new ThreadDemo1("First");//new State
		//ThreadDemo1 t2= new ThreadDemo1("Second");
		
		
		ThreadDemo1 t1 = new ThreadDemo1();//new State
		ThreadDemo1 t2= new ThreadDemo1();
		
		//set name of the Thread
		//t1.setName("First Thread");
		//t2.setName("Second Thread");
        
		t1.start();
		t2.start();
	}

}

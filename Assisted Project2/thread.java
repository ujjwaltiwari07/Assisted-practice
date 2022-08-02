package multithreading;
class userdefine extends Thread{
	public void run(){
		
		System.out.println("this is user define thread ");
	}
	
	
}

public class thread {
public static void main(String args[]) {
	
	
	
	System.out.println("start");
	Thread t=Thread.currentThread();
	String s=t.getName();
	System.out.println("thread name is  "+ s);
	//we now change the thread name
	t.setName("parent main:");
	String st=t.getName();
	System.out.println("now name is changed  "+ st);
	//now we sleep the thread for 4 sec..
	
		
	
		
	

	//get id of thread
	System.out.println("id of thread "+t.getId());
	 userdefine th=new  userdefine();
	 th.start();
	 
	System.out.println("End");
	
}
}

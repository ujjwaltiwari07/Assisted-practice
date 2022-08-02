package multithreading;
class test extends Thread{
	public void run()
	{
		
		
		
		try { 
			Thread.sleep(2000);

			for(int i=1;i<=5;i++) {
				
				
				System.out.println("this is child thread " + i +" time");}
			
		}
	
		catch(Exception e) 
		{
			System.out.println(e);
		
		}
		
}}
public class multi {

	public static void main(String[] args) {
		test t=new test();
	
		t.start();
		
	
		
			System.out.println("this is main thread");
		}
		

	
}


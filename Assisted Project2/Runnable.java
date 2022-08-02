package multithreading;

public class test1 {

}
class t1 implements Runnable {
	 
    // Method 1
    // run() method for the thread
    public void run()
    {
 
        // Print statement
        System.out.println("Thread is created using Runnable interface");
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of our thread class inside main()
        // method
        t1 obj = new t1();
       
        // Passing the object to thread in main()
        Thread myThread = new Thread(obj);
       
        // Starting the thread
        myThread.start();
    }
}
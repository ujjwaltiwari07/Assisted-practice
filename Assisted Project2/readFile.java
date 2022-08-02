import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class readFile {
	public static void main(String args[])
	{
		
		try {
			
			      File f= new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\new.txt");
			     Scanner sc=new Scanner(f);
			    		 while(sc.hasNext())
			    		 {
			    			 String s = sc.nextLine();
			    			 System.out.println(s);
			    		 }}
			    	catch(IOException e) {
			System.out.println("IOException");

}}}

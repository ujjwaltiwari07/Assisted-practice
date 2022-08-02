import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileInputStream;

class createFile{
	public static void main(String args[])
	{
		try {
	
		 File f=new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\new.txt");
		
		if(f.createNewFile())
		{
			System.out.println("created the new file ------name is -----"+f.getName());
			
		}
		else
		{
			System.out.println("alredy exist");
			
		}}
		catch(IOException e) 
		{
			System.out.println("IOException");
		} 
	}
	}
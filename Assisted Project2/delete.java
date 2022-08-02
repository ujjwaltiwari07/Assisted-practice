import java.io.File;
import java.io.IOException;

public class delete {
	public static void main(String args[]) throws IOException
	{
	 File f=new File("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\File.txt");
		
	  if (f.delete()) {
          System.out.println("File deleted successfully");
      }
      else {
          System.out.println("Failed to delete the file");
      }
}}

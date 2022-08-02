import java.io.File;
	import java.io.FileWriter;
	import java.io.PrintWriter;
	import java.io.IOException;

	public class append {
	   public static void main( String[] args ) throws IOException {

	     
			FileWriter fw=new FileWriter("C:\\Users\\Ujjwal Tiwari\\Desktop\\javafile\\new.txt",true);
				PrintWriter out=new PrintWriter(fw);
				
				//appending
				out.println("this is append in the previous file new");
				out.close();
				System.out.print("appending done");

	      }
	   }
	


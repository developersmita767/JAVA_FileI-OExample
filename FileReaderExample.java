package Abacus;

import java.io.File;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		 

	    try {
	    	File file=new File("output.txt");
	      // Creates a reader using the FileReader
	      FileReader input = new FileReader("C:\\Eclipse Java\\src\\Test\\output.txt");
	      
	      int i;
	      System.out.println("Data in the file: ");
	      while((i=input.read())!=-1) {
	    	  System.out.print((char) i);  
	      }
	      System.out.println("Last"+input.read());
	      // Closes the reader
	      input.close();
	    }

	    catch(Exception e) {
	      e.printStackTrace();
	    }

	}

}

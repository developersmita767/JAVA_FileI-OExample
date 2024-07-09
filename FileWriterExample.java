package Abacus;



import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) {
		String data = "This is the data in the output file";

		try {
	    	 
	      // Creates a FileWriter
	      FileWriter output = new FileWriter("C:\\Eclipse Java\\src\\Test\\output.txt");

	      // Writes the string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	      System.out.println("data written to the file");
	    }catch (Exception e) {
	      e.getStackTrace();
	    }
		
	}
	

}

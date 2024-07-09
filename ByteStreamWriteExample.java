package Abacus;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriteExample {

	public static void main(String[] args) {
		FileOutputStream fout=null;
		// Step 1: Creating object of the file and
        try {
			 fout
			    = new FileOutputStream("C:\\Eclipse Java\\src\\Test\\demo.txt");
			// Step 2: Storing text into String datatype
            String s
                = "Welcome to Abacus! This is an example of Java program to write Bytes using ByteStream.";
            // Step 3: Converting string into byte array
            byte b[] = s.getBytes();
 
            // Step 4: Write byte data to file output
            fout.write(b);
 
            
		} catch (IOException e) {
			System.out.println("Not able to write to the file");
		}finally {
			// Step 5: Close the file using close() method
            try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

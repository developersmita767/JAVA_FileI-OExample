package Abacus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamReadExample {

	public static void main(String[] args) {
		  File file = new File( "C:\\Eclipse Java\\src\\Test\\demo.txt"); 
		
		try {
			// Creating an object of FileInputStream to 
	        // read from a file 
	        FileInputStream fl = new FileInputStream(file);
			// Now creating byte array of same length as file 
	        byte[] arr = new byte[(int)file.length()]; 
	  
	        // Reading file content to byte array 
	        // using standard read() method 
	        fl.read(arr); 
	        System.out.println(Arrays.toString(arr));
	       
	        fl.close(); 
	        String data =new String(arr);
	        System.out.print(data); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
  
        

	}

}

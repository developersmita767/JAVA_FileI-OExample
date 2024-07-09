package Abacus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Eclipse Java\\src\\Test\\output.txt");    
        BufferedReader br=new BufferedReader(fr);    

       
        String str;
        while((str=br.readLine())!=null) {
        	System.out.println(str); 
        }
        	
        
        br.close();    
        fr.close(); 

	}

}

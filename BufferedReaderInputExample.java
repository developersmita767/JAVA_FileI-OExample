package Abacus;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInputExample {

	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);           
	     String name="";    
	     while(!name.equals("stop")){    
	      System.out.println("Enter message: ");    
	      name=br.readLine();    
	      System.out.println("Message is: "+name);    
	     }              
	    br.close();    
	    r.close();    


	}

}

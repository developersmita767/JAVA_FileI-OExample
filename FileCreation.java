package Abacus;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		
		
		File file=new File("C:\\Eclipse Java\\src\\Test\\test.txt");
		try {
			boolean isFileCreated=file.createNewFile();
			if(isFileCreated) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

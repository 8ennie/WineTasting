package example.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.concurrent.Task;



public class ReaderTxt{ 

	protected String read(File fileToRead) {  
		  String content = "";  
		    try {
		      		    	
		      FileInputStream fis = new FileInputStream(fileToRead); 
		      int charAsByte;
		      StringBuilder sb = new StringBuilder();
			      while ((charAsByte = fis.read()) != -1) {
					// convert to char and display it
					sb.append((char) charAsByte);
				}
		      fis.close();

		      content = sb.toString(); 
		    } catch (FileNotFoundException exception) {
		      System.out.println(exception.getMessage());
		    } catch (IOException ioE) {
		    	System.out.println(ioE.getMessage());
			} 
		    finally{
		    	System.out.println("Reading abort");
		    }
		   
	    return content;
	}

	
	
}

	

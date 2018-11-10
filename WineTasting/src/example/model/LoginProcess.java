package example.model;

import java.io.File;

import javafx.concurrent.Task;

public class LoginProcess extends Task<Object> {
    
	private File fileToRead;
	private String userName;
	private String password;
	
	public LoginProcess(String filePath, Login log){
		fileToRead = new File(filePath);
		userName = log.getUsername();
		password = log.getPassword();
	}
	
	@Override
    public Boolean call() {
		 ReaderTxt readerTxt = new ReaderTxt();
		 String content = readerTxt.read(fileToRead);
        
     return verifyLogin(userName, password, content);   
    }

	public boolean verifyLogin(String userName, String password, String fileContent){
		
		String[] userPass = fileContent.split(":");
		if (userName.equals(userPass[0])){
			if (password.equals(userPass[1])){
				return true;
			}
		}
		
		return false;
		
	}
	
}

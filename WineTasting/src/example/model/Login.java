package example.model;

public class Login {

    String username = null;                            
    String password = null;
                  
    public void setUsernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	} 
}




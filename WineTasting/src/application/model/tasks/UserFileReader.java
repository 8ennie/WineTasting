package application.model.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import application.model.data.User;


public class UserFileReader {

	private static List<User> usersFromFile = new ArrayList<User>();
	
	private static void readUsers() {
		try {

			FileInputStream fstream = new FileInputStream("U:\\git\\WineTasting\\WineTasting\\src\\application\\model\\data\\UserList.csv");
			BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
			
			String line = null;
			while((line = reader.readLine()) != null) {
				String[] linesSplit = line.trim().split(";");
				User tempUser = new User(linesSplit[0], linesSplit[1]);
				System.out.println(tempUser);
				if (!usersFromFile.contains(tempUser)) {
					usersFromFile.add(tempUser);
				}
			}
			// Close the input stream
			reader.close();
		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static List<User> getUsers() {
		readUsers();
		return usersFromFile;
		
		
	}

}

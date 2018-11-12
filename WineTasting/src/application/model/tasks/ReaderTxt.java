package application.model.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import application.model.data.User;


public class ReaderTxt {

	protected boolean read() {
		try {

			FileInputStream fstream = new FileInputStream("C:\\Users\\bcwie\\git\\WineTasting\\WineTasting\\src\\application\\model\\UserList.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;

			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				User nUser = new User();
				String[] userDitails = strLine.split(":");
				nUser.setUsername(userDitails[0]);
				nUser.setPassword(userDitails[1]);
				User.addUser(nUser);
			}

			// Close the input stream
			br.close();
			return true;
		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

}

/**
 * 
 */
package application.model.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import application.model.data.Stand;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Noah Ruben
 * @see <a href="https://github.com/8ennie/WineTasting">Github</a>
 */
public class StandFileHandler{
	private static final String PATH = new File("").getAbsolutePath() + "\\WineTasting\\src\\application\\model\\data\\Stand.csv";

	private static ObservableList<Stand> standFromFile = FXCollections.observableArrayList();

	public static ObservableList<Stand> getStand(){
		readUsers();
		return standFromFile;

	}

	public static void persistUser(Stand stand) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true));
		writer.write(stand.getStandId() + ";" + stand.getStandName() + ";" + stand.getStandLocation() + ";" + stand.getStandOwner());
		writer.newLine();
		writer.flush();
		writer.close();
	}

	private static void readUsers(){
		try{

			FileInputStream fstream = new FileInputStream(PATH);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));

			String line = null;
			while ((line = reader.readLine()) != null){
				String[] linesSplit = line.trim().split(";");
				System.out.println(linesSplit[0]);
				Stand tempStand = new Stand(Integer.parseInt(linesSplit[0]), linesSplit[1],linesSplit[2],linesSplit[3]);
				System.out.println(tempStand);
				if(!standFromFile.contains(tempStand)){
					standFromFile.add(tempStand);
				}
			}
			// Close the input stream
			reader.close();
		} catch (FileNotFoundException exception){
			System.out.println(exception.getMessage());

		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

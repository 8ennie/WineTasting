/**
 * 
 */
package application.model.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import application.model.data.Stand;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author bcwie
 *
 */
public class CsvFileReader {

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";

	// Student attributes index
	private static final int standId = 0;
	private static final int STAND_NAME = 1;
	private static final int STAND_LOCATION = 2;
	private static final int STAND_OWNER = 3;
	

	public static ObservableList<Stand> readCsvFile(String fileName) {

		BufferedReader fileReader = null;

		// Create a new list of student to be filled by CSV file data
		ObservableList<Stand> standList = FXCollections.observableArrayList();
		
		try {

			

			String line = "";

			// Create the file reader
			fileReader = new BufferedReader(new FileReader(fileName));

			// Read the CSV file header to skip it
			fileReader.readLine();

			// Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0) {
					// Create a new student object and fill his data
					Stand stand = new Stand(Integer.parseInt(tokens[standId]), tokens[STAND_NAME],tokens[STAND_LOCATION],tokens[STAND_OWNER]);
					standList.add(stand);
				}
			}
			Stand.setStandList(standList);
			Stand.setAnzStand();
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				return standList;
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}
		return null;

	}
}

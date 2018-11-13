package application.model.tasks;

import java.io.FileWriter;
import java.io.IOException;

import application.model.data.Stand;
import application.model.data.Wine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CsvFileWriter {

	

	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header

	public static void writeStandToCsvFile(String fileName, Stand stand) {

		String FILE_HEADER = "standId,standName,standLocation,standOwner";

		FileWriter fileWriter = null;
		try {
			
			ObservableList<Stand> standCurList = Stand.getStandList();
			fileWriter = new FileWriter(fileName);
			
			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			for (Stand stand2 : standCurList) {
				// Write a new student object list to the CSV file
				
				fileWriter.append(String.valueOf(stand2.getStandId().getValue()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(stand2.getStandName().getValue()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(stand2.getStandLocation().getValue()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(stand2.getStandOwner().getValue()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}


	public static void writeStandToCsvFile(String fileName, Wine wine) {

		String FILE_HEADER = "wineId,name,description,standId";

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileName);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new student object list to the CSV file
				fileWriter.append(String.valueOf(wine.getWineId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(wine.getName()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(wine.getDescription()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(wine.getStandId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}
	
}

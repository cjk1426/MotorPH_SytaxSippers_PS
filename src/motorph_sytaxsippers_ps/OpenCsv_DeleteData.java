package motorph_sytaxsippers_ps;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsv_DeleteData {

    public static void main(String[] args) throws CsvValidationException {
        // Get the current working directory
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "CredentialDetails.csv";

        // Define the condition for deletion (e.g., delete rows with Username "user")
        String usernameToDelete = "user";

        // Delete rows matching the condition
        deleteFromCSV(csvFile, usernameToDelete);
    }

    public static void deleteFromCSV(String filePath, String usernameToDelete) throws CsvValidationException {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("CSV file does not exist: " + filePath);
            return;
        }

        List<String[]> remainingRows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] nextLine;

            // Read all rows and filter out the ones to delete
            while ((nextLine = reader.readNext()) != null) {
                // Skip the rows where the Username matches the condition
                if (!nextLine[0].equalsIgnoreCase(usernameToDelete)) {
                    remainingRows.add(nextLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the remaining rows back to the CSV file
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, false))) { // 'false' overwrites the file
            for (String[] row : remainingRows) {
                writer.writeNext(row);
            }
            System.out.println("Rows with Username '" + usernameToDelete + "' have been deleted from " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

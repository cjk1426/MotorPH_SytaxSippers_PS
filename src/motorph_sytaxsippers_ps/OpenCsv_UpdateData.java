

package motorph_sytaxsippers_ps;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsv_UpdateData {


    
    public static void updateCSV(String filePath, String empNumber, String[] updatedData) throws IOException, CsvException {
        // Read all rows from the CSV file
        List<String[]> rows = new ArrayList<>();
        boolean isUpdated = false;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            rows = reader.readAll();

            // Update the specific row
            for (int i = 0; i < rows.size(); i++) {
                String[] row = rows.get(i);
                if (row.length > 0 && row[0].equals(empNumber)) { // Check if Employee # matches
                    rows.set(i, updatedData); // Replace the row with updated data
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            throw new IllegalArgumentException("Employee number " + empNumber + " not found in the file.");
        }

        // Write updated rows back to the CSV file
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, false))) {
            writer.writeAll(rows);
        }

        System.out.println("CSV file updated successfully!");
    }

    public static void main(String[] args) throws CsvException {
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "EmployeeDetails_AdminView.csv";

        String empNumber = "1001"; // Example employee number
        String[] updatedData = {"1001", "Doe", "John", "123-45-6789", "PHL123", "TIN123", "PAGIBIG123"}; // Updated row

        try {
            updateCSV(csvFile, empNumber, updatedData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    
    
}

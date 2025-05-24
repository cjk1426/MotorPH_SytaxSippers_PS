


//implementation of search Data structure algorithm in opencsv

package motorph_sytaxsippers_ps;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class OpenCSV_HashMapSearch {

    public static void main(String[] args) throws CsvValidationException {
        // TODO code application logic here
        
            // Get the current working directory
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "CredentialDetails.csv";

        // link csv data to hashmap
        HashMap<String, String[]> csvData = preprocessCSV(csvFile);

        // Search for a specific username
        String searchUsername = "Cg";
        searchInData(csvData, searchUsername);
        
    }
    
    // Preprocess the CSV into a HashMap
    public static HashMap<String, String[]> preprocessCSV(String filePath) throws CsvValidationException {
        HashMap<String, String[]> dataMap = new HashMap<>();

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("CSV file does not exist: " + filePath);
            return dataMap;
        }

        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] nextLine;

            // Skip the header if present
            reader.readNext();

            // Read and store data in HashMap
            while ((nextLine = reader.readNext()) != null) {
                String key = nextLine[0]; // Assuming "Username" is the key column
                dataMap.put(key, nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CSV data has been preprocessed.");
        return dataMap;
    }
    // Search in the preprocessed data
    public static void searchInData(HashMap<String, String[]> dataMap, String searchUsername) {
        if (dataMap.containsKey(searchUsername)) {
            String[] row = dataMap.get(searchUsername);
            System.out.println("Match found:");
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // New line after printing the row
        } else {
            System.out.println("No match found for username: " + searchUsername);
        }
    }
}

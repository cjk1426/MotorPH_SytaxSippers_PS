

package motorph_sytaxsippers_ps;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OpenCSV_Writedata {

    public static void main(String[] args) {
        // TODO code application logic here
                // Get the current working directory
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "CredentialDetails.csv";

        // Example data to write to the CSV
        String[] header = {"UserLogin", "UserPassword", "Role","UserName","Email"};
        String[] data1 = {"Cg", "eweww", "ADMIN","wrqwrqwr","wqrqwwqr"};
     //   String[] data2 = {"user", "user123", "USER","qwrqwrqwr","qwrqwrqr"};

        // Write data to the CSV file
        writeToCSV(csvFile, header, data1);
        
    }

    public static void writeToCSV(String filePath, String[] header, String[]... rows) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) { // 'true' enables appending
            // If the file doesn't exist, write the header
            File file = new File(filePath);
            if (!file.exists()) {
                writer.writeNext(header);
            }

            // Write the rows
            for (String[] row : rows) {
                writer.writeNext(row);
            }

            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}

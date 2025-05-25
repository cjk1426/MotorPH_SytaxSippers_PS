package motorph_sytaxsippers_ps;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;


public class OpenCSVtest {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
                String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources\\MotorPHEmployeeData-EmployeeDetails.csv"; // Build the file path


            try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                for (String value : nextLine) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
       
    }

}



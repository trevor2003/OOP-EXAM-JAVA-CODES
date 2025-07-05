import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("path/to/your/medicalLogFile.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(medicalLogFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

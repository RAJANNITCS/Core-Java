import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementExample {
    public static void main(String[] args) {
        // Using try-with-resources to ensure the BufferedReader is closed
        try (BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // The 'reader' is automatically closed here, even if an exception occurs
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_buffer_reader_copy {

    public static void main(String[] args) {

        String path = "C:\\Users\\davi0\\Desktop\\2023\\JAVA\\visual_studio\\working_with_file\\application\\in.txt";

        // in this version is the best practice, less verbose
        // calling buffer and file reader in try, we don't need to close them afterwards

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // request to read one line

            while (line != null) {
                System.out.println(line); // if there is anything in the line, it will print it, then read the next line
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

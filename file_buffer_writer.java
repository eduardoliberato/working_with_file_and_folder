import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file_buffer_writer {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\\\Users\\\\davi0\\\\Desktop\\\\2023\\\\JAVA\\\\visual_studio\\\\working_with_file\\\\application\\out.txt";

        //it creates or update a file with this caracteristics, because of the "true", it do not delete the older version
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
